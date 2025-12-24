package com.shopwithme.productservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopwithme.productservice.model.User;
import com.shopwithme.productservice.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Register
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            return "Email already exists!";
        }
        userRepository.save(user);
        return "Success";
    }

   // Login
    @PostMapping("/login")
    public String login(@RequestBody User user) {
        System.out.println("LOGIN ATTEMPT:"); // Debug print
        System.out.println("Input Username: " + user.getUsername());
        System.out.println("Input Password: " + user.getPassword());

        Optional<User> foundUser = userRepository.findByUsernameAndPassword(
            user.getUsername(), user.getPassword()
        );
        
        if (foundUser.isPresent()) {
            System.out.println("User FOUND in database!");
            return "Success";
        } else {
            System.out.println("User NOT FOUND.");
            return "Failure";
        }
    }
}