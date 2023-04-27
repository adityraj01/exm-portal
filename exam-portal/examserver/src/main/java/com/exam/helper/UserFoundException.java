package com.exam.helper;

public class UserFoundException extends Exception{
    public UserFoundException(){
        super("User with username is already there in DB !!");
    }

    public UserFoundException(String message) {

        super(message);
    }
}
