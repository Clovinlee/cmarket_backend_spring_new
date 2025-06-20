package com.chris.cmarket.User.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LoginUserDTO {
    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;
}
