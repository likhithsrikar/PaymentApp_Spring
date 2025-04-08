package com.likhith.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.likhith.entities.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

Optional<UserEntity> findByuser_nameAndpassword(String username, String password);
	
	
	
}
