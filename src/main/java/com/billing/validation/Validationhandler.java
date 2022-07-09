package com.billing.validation;

import java.net.http.HttpHeaders;
import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestControllerAdvice
public class Validationhandler extends ResponseEntityExceptionHandler{
	
	
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, 
			HttpHeaders headers, HttpStatus status, WebRequest webRequest) {
		
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) ->{
			
			String fieldName = ((FieldError) error).getField();
			String message = error.getDefaultMessage();
			errors.put(fieldName, message);
			
		});
		
		return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
		
	}
	
	

}
