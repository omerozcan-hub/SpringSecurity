package com.example.security.basicauth.dto;


import lombok.Builder;

import javax.management.relation.Role;
import java.util.Set;


@Builder
public record CreateUserRequest (
        String name,
        String username,
        String password,
        Set<Role> authorities
){
}