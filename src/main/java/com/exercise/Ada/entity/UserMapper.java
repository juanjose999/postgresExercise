package com.exercise.Ada.entity;

public class UserMapper {

    public static User userDtoToUser(UserDto userDto){
        return new User(
                userDto.getName(),
                userDto.getEmail()
        );
    }

    public static UserResponseDto userToUserResponseDto(User user){
        return new UserResponseDto(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }
}
