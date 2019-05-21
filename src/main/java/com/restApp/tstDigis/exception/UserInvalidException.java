package com.restApp.tstDigis.exception;

public class UserInvalidException extends UserException {

    public UserInvalidException() {
        this("Incorrect values");
    }

    public UserInvalidException(String message) {
        super(message);
    }

}

