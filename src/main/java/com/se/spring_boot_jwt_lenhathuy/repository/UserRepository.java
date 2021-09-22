package com.se.spring_boot_jwt_lenhathuy.repository;

import com.se.spring_boot_jwt_lenhathuy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
