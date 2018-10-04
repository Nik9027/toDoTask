package com.emirates.toDoTaskServiceApp.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.emirates.toDoTaskServiceApp.models.ExceptionResponse;

@ControllerAdvice
public class ToDoExceptionHandler {

	public ResponseEntity<ExceptionResponse> generalException (Exception e) throws Exception{
		
		ExceptionResponse er = new ExceptionResponse();
		er.setCode(500);
		er.setDescription("Error Occured");
		
		return new ResponseEntity<ExceptionResponse>(er, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
