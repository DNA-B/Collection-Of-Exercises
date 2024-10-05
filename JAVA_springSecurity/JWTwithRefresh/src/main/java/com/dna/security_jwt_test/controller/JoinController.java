package com.dna.security_jwt_test.controller;

import com.dna.security_jwt_test.dto.JoinDTO;
import com.dna.security_jwt_test.service.JoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JoinController {
    private final JoinService joinService;
    
    @PostMapping("/join")
    public String joinProcess(JoinDTO dto) {
        joinService.joinProcess(dto);
        return "ok";
    }
}
