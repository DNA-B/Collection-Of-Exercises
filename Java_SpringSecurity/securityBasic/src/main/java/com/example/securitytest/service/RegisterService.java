package com.example.securitytest.service;

import com.example.securitytest.dto.RegisterDTO;
import com.example.securitytest.entity.UserEntity;
import com.example.securitytest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    
    
    public void register(RegisterDTO registerDto) {
        if (userRepository.existsByUsername(registerDto.getUsername())) {
            return; // 중복 검증
        }
        
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(registerDto.getUsername());
        userEntity.setPassword(bCryptPasswordEncoder.encode(registerDto.getPassword()));
        userEntity.setRole("ROLE_ADMIN");
        userRepository.save(userEntity);
    }
}
