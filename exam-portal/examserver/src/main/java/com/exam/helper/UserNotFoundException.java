package com.exam.helper;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(){
        super("User with this username doesnot exists!!");
    }

    public UserNotFoundException(String message) {
        super(message);
    }
}
