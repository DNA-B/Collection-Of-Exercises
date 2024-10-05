package com.example.securitytest.entity;

import com.example.securitytest.dto.CustomUserDetails;
import com.example.securitytest.repository.UserRepository;
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
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { // 인자로 받는 username은 프론트에서 전달한 값
        UserEntity findUser = userRepository.findByUsername(username);
        
        if (findUser == null) {
            throw new UsernameNotFoundException(username);
        }
        
        return new CustomUserDetails(findUser);
    }
}
