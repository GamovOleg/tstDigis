package com.restApp.tstDigis.exception;

public class UserNotFoundException extends UserException {

    public UserNotFoundException() {
        this("User not found in the DB");
    }

    public UserNotFoundException(String message) {
        super(message);
    }

}

