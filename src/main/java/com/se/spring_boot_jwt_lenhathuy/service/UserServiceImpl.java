package com.se.spring_boot_jwt_lenhathuy.service;


import com.se.spring_boot_jwt_lenhathuy.authen.UserPrincipal;
import com.se.spring_boot_jwt_lenhathuy.entity.User;
import com.se.spring_boot_jwt_lenhathuy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }

}
