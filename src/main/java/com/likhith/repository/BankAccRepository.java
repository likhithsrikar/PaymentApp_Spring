package com.likhith.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.likhith.entities.BankAccEntity;

import java.util.List;

@Repository
public interface BankAccRepository extends JpaRepository<BankAccEntity, Integer> {

    // Find all bank accounts associated with a specific user ID
    List<BankAccEntity> findByUserUserId(Integer userId);
}
