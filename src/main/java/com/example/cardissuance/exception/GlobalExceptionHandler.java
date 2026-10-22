package com.example.cardissuance.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationErrors(MethodArgumentNotValidException exception) {
        Map<String, String> errorMap = new LinkedHashMap<>();
        for(FieldError error: exception.getBindingResult().getFieldErrors()) {
            String nameMapKey = error.getField();
            String errorMessage = error.getDefaultMessage();

            errorMap.putIfAbsent(nameMapKey, errorMessage);
        }
        return ResponseEntity.badRequest().body(errorMap);
    }
}
