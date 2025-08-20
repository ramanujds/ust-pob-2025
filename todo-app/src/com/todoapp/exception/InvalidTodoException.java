package com.todoapp.exception;

public class InvalidTodoException extends RuntimeException{

    public InvalidTodoException(String message) {
        super(message);
    }
}
