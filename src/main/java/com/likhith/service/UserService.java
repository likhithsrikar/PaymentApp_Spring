package com.likhith.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.likhith.entities.UserEntity;
import com.likhith.repository.UserRepository;

@Service
public class UserService {
		@Autowired
		UserRepository userDAO;
		
		public List<UserEntity> getAllUsers(){
			List<UserEntity> users=userDAO.findAll();
			return users;
		}
		
		public UserEntity getUserById(int userId) {
			Optional<UserEntity> user = userDAO.findById(userId);
			return user.get();
		}
		
		
	/*	public UserEntity validateUser(String username,String password) {
			Optional<UserEntity> existingUser=userDAO.findByUserNameAndPassword(username, password);
			
			if(existingUser.isPresent()) {
				return existingUser.get();
			}else {
				return null;
			}
			
		}*/	
}
