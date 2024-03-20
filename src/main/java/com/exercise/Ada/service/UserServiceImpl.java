package com.exercise.Ada.service;

import com.exercise.Ada.entity.UserDto;
import com.exercise.Ada.entity.UserMapper;
import com.exercise.Ada.entity.UserResponseDto;
import com.exercise.Ada.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<UserResponseDto> getAllUser() {
        List<UserResponseDto> userResponseDto = new ArrayList<>();
        userRepository.getAllUser().forEach(u -> userResponseDto.add(UserMapper.userToUserResponseDto(u)));
        return userResponseDto;
    }

    public Optional<UserResponseDto> findUserById(Long idUser) {
        UserResponseDto userResponseDto = UserMapper.userToUserResponseDto(userRepository.findUserById(idUser));
        return Optional.of(userResponseDto);
    }

    @Override
    public UserResponseDto saveUser(UserDto user) {
         return UserMapper.userToUserResponseDto(userRepository.saveUser(UserMapper.userDtoToUser(user)));
    }

    @Override
    public Boolean deleteUser(String idUser) {
        return userRepository.deleteUser(idUser);
    }
}
