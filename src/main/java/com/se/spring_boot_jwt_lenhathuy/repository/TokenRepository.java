package com.se.spring_boot_jwt_lenhathuy.repository;

import com.se.spring_boot_jwt_lenhathuy.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository
        extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
