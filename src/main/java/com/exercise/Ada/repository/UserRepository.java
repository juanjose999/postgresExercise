package com.exercise.Ada.repository;

import com.exercise.Ada.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> getAllUser();
    User findUserById(Long idUser);
    User saveUser (User user);
    //User updateUser (String idUser, User user);
    Boolean deleteUser (String idUser);
}
