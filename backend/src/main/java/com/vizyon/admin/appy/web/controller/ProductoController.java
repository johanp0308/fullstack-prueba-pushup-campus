package com.vizyon.admin.appy.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/productos")
@SecurityRequirement(name = "bearerAuth")
public class ProductoController {
    
}
