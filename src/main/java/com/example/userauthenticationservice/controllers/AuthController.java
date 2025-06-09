package com.example.userauthenticationservice.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userauthenticationservice.dtos.LogInDTO;
import com.example.userauthenticationservice.dtos.SignUpRequestDTO;
import com.example.userauthenticationservice.dtos.UserDTO;

@RestController
@RequestMapping("/auth")
public class AuthController {
 
    
    public UserDTO signUp(@RequestBody SignUpRequestDTO SignUpRequestDTO){
        return null;
    }

    public UserDTO logIn(@RequestBody LogInDTO LogInDTO){
        return null;
    }
}
