package com.example.demo.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler{

	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleAnyException(Exception e, WebRequest wr)
	{
		String msg = e.getMessage();
		
		if(msg == null)
			msg = e.toString();
		
		ErrorMessage errMsg = new ErrorMessage(new Date(),msg);
		return(new ResponseEntity<Object>(errMsg, new HttpHeaders(),HttpStatus.INTERNAL_SERVER_ERROR));
	}
}
