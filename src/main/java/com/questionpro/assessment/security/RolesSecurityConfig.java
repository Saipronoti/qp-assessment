package com.questionpro.assessment.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class RolesSecurityConfig {


    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){

        UserDetails admin= User.builder().username("admin").password("{noop}admin123").roles("ADMIN").build();
        UserDetails user= User.builder().username("user").password("{noop}user123").roles("USER").build();

        return new InMemoryUserDetailsManager(admin,user);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{

        httpSecurity.authorizeHttpRequests(configure->
                configure.requestMatchers(HttpMethod.POST,"/qp-assessment/grocery/items").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET,"/qp-assessment/grocery/items").hasAnyRole("ADMIN","USER")
                        .requestMatchers(HttpMethod.GET,"/qp-assessment/grocery/items/**").hasAnyRole("ADMIN","USER")
                        .requestMatchers(HttpMethod.PUT,"/qp-assessment/grocery/items/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.DELETE,"/qp-assessment/grocery/items/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.POST,"/qp-assessment/grocery/orders").hasRole("USER")
                        .requestMatchers(HttpMethod.POST,"/qp-assessment/grocery/order").hasRole("USER")
                        .requestMatchers(HttpMethod.GET,"/qp-assessment/grocery/orders").hasRole("USER")
        );

        httpSecurity.httpBasic(Customizer.withDefaults());
        httpSecurity.csrf(AbstractHttpConfigurer::disable);
        return httpSecurity.build();
    }


}



