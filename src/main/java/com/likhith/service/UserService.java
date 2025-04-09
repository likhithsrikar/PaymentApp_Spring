package com.likhith.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.likhith.entities.UserEntity;
import com.likhith.repository.UserRepository;


@Service
public class UserService {
    @Autowired
    UserRepository userDAO;

    public UserEntity validateUser(String userName, String password) {
        Optional<UserEntity> existingUser = userDAO.findByUserNameAndPassword(userName, password);
        return existingUser.orElse(null);
    }
}
