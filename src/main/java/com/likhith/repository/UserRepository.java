package com.likhith.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.likhith.entities.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

//	Optional<UserEntity> findByUserNameAndPassword(String username, String password);
	
	
	
}
