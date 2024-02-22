package com.york.albertososa.fullstackcustomermanagementapp.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {
        super(message);
    }
}
