package com.dna.security_jwt_test.service;

import com.dna.security_jwt_test.dto.CustomUserDetails;
import com.dna.security_jwt_test.entity.UserEntity;
import com.dna.security_jwt_test.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity findUser = userRepository.findByUsername(username);
        
        if(findUser != null){
            return new CustomUserDetails(findUser);
        }
        
        return null;
    }
}
