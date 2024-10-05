package com.example.securitytest.controller;

import com.example.securitytest.dto.RegisterDTO;
import com.example.securitytest.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class RegisterController {
    private final RegisterService registerService;
    
    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }
    
    @PostMapping("/registerProc")
    public String registerProc(RegisterDTO registerDTO) {
        System.out.println(registerDTO.getUsername() + " " + registerDTO.getPassword());
        registerService.register(registerDTO);
        return "redirect:/login";
    }
}
