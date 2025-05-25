package com.springpractice.todolist.ErrorResponse;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class ErrorResponse {
    LocalDateTime timeStamp;

    public ErrorResponse(String errorMessage, String errorDetails, String errorCode) {
        this.timeStamp = LocalDateTime.now();
        this.errorMessage = errorMessage;
        this.errorDetails = errorDetails;
        this.errorCode = errorCode;
    }

    String errorMessage;
    String errorDetails;
    String errorCode;

}
