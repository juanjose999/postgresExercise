package com.exercise.Ada.repository;

import com.exercise.Ada.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository{

    @Autowired
    private UserRepositorJpa userRepositorJpa;
    @Override
    public List<User> getAllUser() {
        return userRepositorJpa.findAll();
    }

    @Override
    public User findUserById(Long idUser) {
        return userRepositorJpa.findById(idUser).get();
    }

    @Override
    public User saveUser(User user) {
        return userRepositorJpa.save(user);
    }


    @Override
    public Boolean deleteUser(String idUser) {
        return null;
    }
}
