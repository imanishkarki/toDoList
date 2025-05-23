package com.springpractice.todolist.GlobalExceptionHandler;

public class DuplicateContentException extends RuntimeException{
    public DuplicateContentException(String message){
        super(message);
    }

}
