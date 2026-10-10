package com.nexus.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexus.backend.dto.LoginRequest;
import com.nexus.backend.dto.UserResponse;
import com.nexus.backend.entity.User;
import com.nexus.backend.service.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:5174")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }
    
    @PostMapping("/login")
    public UserResponse loginUser(@RequestBody LoginRequest request) {
       User user = userService.loginUser(
            request.getEmail(),
            request.getPassword()
        );
        return new UserResponse(
            user.getId(),
            user.getName(),
            user.getEmail()
        );
    }

}
