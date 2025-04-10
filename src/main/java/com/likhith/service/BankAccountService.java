package com.likhith.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.likhith.entities.BankAccEntity;
import com.likhith.repository.BankAccRepository;

import java.util.List;

@Service
public class BankAccountService {

    @Autowired
    private BankAccRepository bankAccRepository;

    // Retrieve bank accounts by user ID
    public List<BankAccEntity> getBankAccountsByUserId(Integer userId) {
        return bankAccRepository.findByUserUserId(userId);
    }

    // Add a new bank account
    public BankAccEntity addBankAccount(BankAccEntity bankAccEntity) {
        return bankAccRepository.save(bankAccEntity);
    }
}
