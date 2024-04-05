package com.ecom.discoveryserver.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .csrf(Customizer.withDefaults()) // Apply default CSRF configuration
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/eureka/**").permitAll() // Allow requests to /eureka/**
                        .anyRequest().authenticated()); // All other requests require authentication
        return httpSecurity.build();
    }
}
