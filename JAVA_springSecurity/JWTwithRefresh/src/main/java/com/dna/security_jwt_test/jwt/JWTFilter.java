package com.dna.security_jwt_test.jwt;

import com.dna.security_jwt_test.dto.CustomUserDetails;
import com.dna.security_jwt_test.entity.UserEntity;
import io.jsonwebtoken.ExpiredJwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.io.PrintWriter;

@RequiredArgsConstructor
public class JWTFilter extends OncePerRequestFilter {
    private final JWTUtil jwtUtil;
    
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // 헤더에서 access키에 담긴 토큰을 꺼냄
        String accessToken = request.getHeader("access");
        
        if (accessToken == null) {  // 토큰이 없다면 다음 필터로 넘김
            filterChain.doFilter(request, response);
            return;
        }
        
        try { // 토큰 만료 여부 확인
            jwtUtil.isExpired(accessToken);
        }
        catch (ExpiredJwtException e) { // 만료시 다음 필터로 넘기지 않음
            //response body
            PrintWriter writer = response.getWriter();
            //response status code
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return;
        }
        
        String category = jwtUtil.getCategory(accessToken);
        
        if (!category.equals("access")) { // 토큰이 access인지 확인 (발급시 페이로드에 명시)
            //response body
            PrintWriter writer = response.getWriter();
            writer.print("invalid access token");
            
            //response status code
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return;
        }

        // username, role 값을 획득
        String username = jwtUtil.getUsername(accessToken);
        String role = jwtUtil.getRole(accessToken);
        
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(username);
        userEntity.setRole(role);
        CustomUserDetails customUserDetails = new CustomUserDetails(userEntity);
        
        Authentication authToken = new UsernamePasswordAuthenticationToken(customUserDetails, null, customUserDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authToken);
        
        filterChain.doFilter(request, response);
    }
}
