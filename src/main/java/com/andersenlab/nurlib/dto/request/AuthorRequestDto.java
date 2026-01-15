package com.andersenlab.nurlib.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AuthorRequestDto {

    private String fullName;

    private String nationality;

    private LocalDate birthDate;

    private LocalDate deathDate;

    private String biography;
}
