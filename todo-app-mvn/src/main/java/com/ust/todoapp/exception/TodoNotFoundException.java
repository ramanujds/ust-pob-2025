package com.ust.todoapp.exception;

public class TodoNotFoundException extends RuntimeException{

    public TodoNotFoundException(String message) {
        super(message);
    }
}
