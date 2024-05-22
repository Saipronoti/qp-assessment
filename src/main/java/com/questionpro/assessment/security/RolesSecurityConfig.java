package com.questionpro.assessment.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class RolesSecurityConfig {

@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{

    httpSecurity.authorizeHttpRequests(configure->
                configure.requestMatchers(HttpMethod.POST,"/questionpro/items").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET,"/questionpro/items").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PUT,"/questionpro/items").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.DELETE,"/questionpro/items").hasRole("ADMIN")
    );
    httpSecurity.httpBasic(Customizer.withDefaults());
    return httpSecurity.build();
}
}

