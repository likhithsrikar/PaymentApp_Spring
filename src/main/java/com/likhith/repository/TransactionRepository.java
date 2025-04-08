package com.likhith.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.likhith.entities.TransactionEntity;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity , Integer> {

}
