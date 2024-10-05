package com.dna.security_jwt_test.repository;

import com.dna.security_jwt_test.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    boolean existsByUsername(String username);
    
    UserEntity findByUsername(String username);
}
