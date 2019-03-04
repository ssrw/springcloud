package com.munshi.exceptionhandlers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.munshi.entity.ErrorResponse;

@ControllerAdvice

public class ExceptionControllerAdvice {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
        ErrorResponse error = new ErrorResponse();
        error.setErrorcode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        error.setErrorMessage("Please contact your administrator");
        return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
    }
}