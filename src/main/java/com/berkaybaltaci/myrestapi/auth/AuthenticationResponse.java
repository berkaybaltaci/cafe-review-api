package com.berkaybaltaci.myrestapi.auth;

import lombok.Data;

@Data
public class AuthenticationResponse {
    private final String jwt;
}
