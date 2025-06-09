package com.example.userauthenticationservice.dtos;

import com.example.userauthenticationservice.models.BaseModel;
import com.example.userauthenticationservice.models.Role;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO extends BaseModel{
    private String email;
    private Role role;
}
