package com.vizyon.admin.appy.web.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import com.vizyon.admin.appy.domain.services.LoginService;
import com.vizyon.admin.appy.persistences.dto.UserDTO;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;


@RestController
@SecurityRequirement(name = "bearerAuth")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("login")
    public ResponseEntity<?> login(
            @RequestParam("username") String username,
            @RequestParam("password") String password) {

        UserDTO userDTO = loginService.loginUser(username, password);

        if(userDTO == null){
            throw new UsernameNotFoundException("No existe");
        }
        return ResponseEntity.ok().body(userDTO);   
    }

    @PostMapping("registerUser")
    public ResponseEntity<?> registerUser(
            @RequestParam("username") String username,
            @RequestParam("password") String password) {
        UserDTO userDTO = loginService.registerUser(username, password);
        if(userDTO == null){
            throw new UsernameNotFoundException("No se creo");
        }
        return ResponseEntity.ok().body(userDTO);
    }
    
    @PostMapping("validateToken")
    public ResponseEntity<?> validateToken(@RequestParam("token") String token) {
        Map<String,Object> tokenMap = loginService.validateTokeN(token);
        return ResponseEntity.ok().body(tokenMap);
    }
    

    
}
