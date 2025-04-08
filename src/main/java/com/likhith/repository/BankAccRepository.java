package com.likhith.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.likhith.entities.BankAccEntity;

@Repository
public interface BankAccRepository extends JpaRepository<BankAccEntity, Integer> {

}
