package com.likhith.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.likhith.entities.TransactionEntity;
import com.likhith.service.TransactionService;

import jakarta.servlet.http.HttpSession;


import java.util.List;

import jakarta.servlet.http.HttpSession;

@Controller
public class DashBoardController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/dashboard")
    public String dashboard(HttpSession session, Model model) {
        Integer userId = (Integer) session.getAttribute("userId");
        if (userId == null) {
            return "redirect:/login"; 
        }

        model.addAttribute("username", session.getAttribute("username"));
        return "dashboard";
    }

    @GetMapping("/transactions")
    public String viewTransactions(HttpSession session, Model model) {
        Integer userId = (Integer) session.getAttribute("userId");
        if (userId == null) {
            return "redirect:/login"; 
        }

       
        List<TransactionEntity> transactions = transactionService.getTransactionsBySourceId(userId);

        
        model.addAttribute("transactions", transactions);

        return "transactions"; 
    }
}

