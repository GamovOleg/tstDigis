package com.restApp.tstDigis.exception;

public class UserAlreadyExistsException extends UserException {

    public UserAlreadyExistsException() {
        this("User already exists");
    }

    public UserAlreadyExistsException(String message) {
        super(message);
    }

}
