package com.likhith.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.likhith.entities.BankAccEntity;
import com.likhith.entities.UserEntity;
import com.likhith.service.BankAccountService;

import jakarta.servlet.http.HttpSession;

import java.util.List;
@Controller
@RequestMapping("/bank-accounts")
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    // Fetch existing bank accounts and display the page
    @GetMapping
    public String viewBankAccounts(HttpSession session, Model model) {
        Integer userId = (Integer) session.getAttribute("userId");
        if (userId == null) {
            return "redirect:/login"; 
        }

        List<BankAccEntity> bankAccounts = bankAccountService.getBankAccountsByUserId(userId);
        model.addAttribute("bankAccounts", bankAccounts);
        return "bankAccounts"; // Render the bankAccounts.jsp page
    }

    // Handle adding a new bank account
    @PostMapping("/add")
    public String addBankAccount(@RequestParam(name = "bankName") String bankName,
                                  @RequestParam(name = "accountNumber") String accountNumber,
                                  @RequestParam(name = "ifscCode") String ifscCode,
                                  @RequestParam(name = "branchLocation") String branchLocation,
                                  HttpSession session) {
        Integer userId = (Integer) session.getAttribute("userId");
        if (userId == null) {
            return "redirect:/login"; 
        }

        UserEntity user = new UserEntity();
        user.setUserId(userId);

        BankAccEntity bankAccount = new BankAccEntity();
        bankAccount.setBankName(bankName);
        bankAccount.setAccountNumber(accountNumber);
        bankAccount.setIfscCode(ifscCode);
        bankAccount.setBranchLocation(branchLocation);
        bankAccount.setUser(user);
        bankAccount.setIsActive("true");

        bankAccountService.addBankAccount(bankAccount);
        return "redirect:/bank-accounts"; // Refresh the page to show updated list
    }
}
