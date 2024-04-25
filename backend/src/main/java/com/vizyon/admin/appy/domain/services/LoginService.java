package com.vizyon.admin.appy.domain.services;

import java.util.Map;

import com.vizyon.admin.appy.persistences.dto.UserDTO;

public interface LoginService {
    
    UserDTO loginUser(String username, String password);
    UserDTO registerUser(String username, String password);
    Map<String,Object> validateTokeN(String token);
}

