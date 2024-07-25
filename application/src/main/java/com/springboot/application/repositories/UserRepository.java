package com.springboot.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.application.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
