package com.se.spring_boot_jwt_lenhathuy.service;

import com.se.spring_boot_jwt_lenhathuy.authen.UserPrincipal;
import com.se.spring_boot_jwt_lenhathuy.entity.User;

public interface UserService {
    User createUser(User user);
}
