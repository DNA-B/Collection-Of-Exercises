package com.dna.security_jwt_test.service;

import com.dna.security_jwt_test.dto.JoinDTO;
import com.dna.security_jwt_test.entity.UserEntity;
import com.dna.security_jwt_test.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    
    public void joinProcess(JoinDTO dto) {
        String username = dto.getUsername();
        String password = dto.getPassword();
        
        if (userRepository.existsByUsername(username)) {
            System.out.println("User already exists");
            return;
        }
        
        UserEntity data = new UserEntity();
        data.setUsername(username);
        data.setPassword(bCryptPasswordEncoder.encode(password));
        data.setRole("ROLE_ADMIN");
        userRepository.save(data);
    }
}
