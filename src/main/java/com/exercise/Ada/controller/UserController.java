package com.exercise.Ada.controller;

import com.exercise.Ada.entity.User;
import com.exercise.Ada.entity.UserDto;
import com.exercise.Ada.entity.UserResponseDto;
import com.exercise.Ada.exception.UserNotFoundException;
import com.exercise.Ada.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    private final UserService userService;
    public UserController(@Autowired UserService userService){
        this.userService = userService;
        loadUser();
    }

    public void loadUser(){
        UserDto userDto = new UserDto("Maria camila duarte", "mariak@gmail.com");
        createUser(userDto);
        UserDto userDto2 = new UserDto("Fernanda Dazarus", "fer@gmail.com");
        createUser(userDto2);
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDto>> getAllUser(){
        try {
            return new ResponseEntity<>(userService.getAllUser(),HttpStatus.OK);
        }catch (UserNotFoundException u){
            throw new UserNotFoundException();
        }
    }

    @PostMapping
    public Optional<UserResponseDto> createUser(@RequestBody UserDto userDto) {
        return Optional.of(userService.saveUser(userDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserResponseDto>> findById(@PathVariable Long id) {
        try{
            return new ResponseEntity<>(userService.findUserById(id), HttpStatus.OK);
        }catch (UserNotFoundException u){
            throw new UserNotFoundException(id);
        }
    }

}
