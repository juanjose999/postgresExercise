package com.exercise.Ada.entity;


import lombok.Data;

@Data
public class UserDto {

    private String name;

    private String email;

    public UserDto(String name, String email) {
        this.name = name;
        this.email = email;
    }

}

