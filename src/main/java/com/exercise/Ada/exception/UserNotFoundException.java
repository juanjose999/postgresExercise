package com.exercise.Ada.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class UserNotFoundException extends ResponseStatusException {

    public UserNotFoundException(Long id) {
        super(HttpStatus.NOT_FOUND, "The user with ID : " + id + " not found in data base.");
    }

    public UserNotFoundException() {
        super(HttpStatus.NOT_FOUND, "Error in load data base.");
    }
}
