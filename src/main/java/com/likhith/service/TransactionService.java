package com.likhith.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.likhith.entities.TransactionEntity;
import com.likhith.repository.TransactionRepository;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<TransactionEntity> getTransactionsBySourceId(Integer sourceId) {
        
        return transactionRepository.findAll();
    }
}
