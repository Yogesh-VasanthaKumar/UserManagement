package com.project.usermanagementsystem.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    @NotNull(message = "Username shouldn't be null")
    private String userName;
    @Pattern(regexp = "^\\d{4}[-]\\d{2}[-]\\d{2}$", message = "Please enter in YYYY-mm-dd format")
    private String dateOfBirth;

    @NotNull
    @Email
    private String email;
    @NotNull
    @Pattern(regexp = "^+\\d{12}$", message = "please enter with country code")
    private String phoneNumber;

   @Pattern(regexp = "\\d{4}[-]\\d{2}[-]\\d}{2}$",message = "Please enter in YYYY-mm-dd format")
    private String currentDT;

}
