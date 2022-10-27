package com.example.demo.exception;
import java.util.Date;



import org.springframework.http.HttpHeaders;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ControllerAdvice;

import org.springframework.web.context.request.WebRequest;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



import com.example.demo.exception.ErrorMessage;



@ControllerAdvice

public class ExceptionHandler extends ResponseEntityExceptionHandler {



	

	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)

	public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest wr) {



		String errorMsg = ex.getMessage();



		if (errorMsg == null) {

			errorMsg = ex.toString();

		}



		ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMsg);



		return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);



	} 



	@org.springframework.web.bind.annotation.ExceptionHandler(NullPointerException.class)

	public ResponseEntity<Object> handleEx(NullPointerException ex, WebRequest wr) {



		String errorMsg = ex.getMessage();



		if (errorMsg == null) {

			errorMsg = ex.toString();

		}



		ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMsg);



		return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);



	}



}