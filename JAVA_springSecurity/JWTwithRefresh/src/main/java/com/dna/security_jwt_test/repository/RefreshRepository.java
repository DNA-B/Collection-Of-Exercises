package com.dna.security_jwt_test.repository;

import com.dna.security_jwt_test.entity.RefreshEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshRepository extends JpaRepository<RefreshEntity, Long> {
    Boolean existsByRefresh(String refresh);
    
    @Transactional
    void deleteByRefresh(String refresh);
}
