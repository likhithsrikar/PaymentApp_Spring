package com.likhith.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.likhith.entities.UserAccEntity;

@Repository
public interface UserAccRepository extends JpaRepository<UserAccEntity, Integer>{

}
