package com.ajay.spring.security.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajay.spring.security.client.entity.PasswordResetToken;

@Repository
public interface PasswordResetTokenRepository extends
        JpaRepository<PasswordResetToken,Long> {
    PasswordResetToken findByToken(String token);
}
