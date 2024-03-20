package com.exercise.Ada.service;

import com.exercise.Ada.entity.User;
import com.exercise.Ada.entity.UserDto;
import com.exercise.Ada.entity.UserResponseDto;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserResponseDto> getAllUser();
    Optional<UserResponseDto> findUserById(Long idUser);
    UserResponseDto saveUser (UserDto user);
    //User updateUser (String idUser, User user);
    Boolean deleteUser (String idUser);
}
