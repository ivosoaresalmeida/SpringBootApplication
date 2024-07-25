package com.springboot.application.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.springboot.application.entities.User;
import com.springboot.application.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Ivo", "ivo@gmail.com", "1234");
        User user2 = new User(null, "Mafalda", "mafalda@gmail.com", "1234");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
