package com.bookapp.exception;
import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.bookapp.bean.ApiErrors;
import com.bookapp.exception.BookNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message = ex.getMessage();
		List<String> details = new ArrayList<>();
		details.add(ex.getMethod() + " not supported");
		details.add("Invalid request Method");
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, details, status);
		return ResponseEntity.status(status).body(errors);

	}

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
		HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message = ex.getMessage();
		List<String> details = new ArrayList<>();
		details.add("Media type not supported");
		headers.add("desc","Invalid media type");
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, details, status);
		return ResponseEntity.status(status).headers(headers).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String message = ex.getMessage();
		List<String> details = new ArrayList<>();
		details.add("Path Variable is missing");
		headers.add("desc","Missing Path variable");
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, details, status);
		return ResponseEntity.status(status).headers(headers).body(errors);
	}
	
	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<Object> handleStudentNotFoundException(BookNotFoundException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String message = ex.getMessage();
		List<String> details = new ArrayList<>();
		details.add("Student Not Fond");
		//headers.add("desc","Missing Path variable");
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, details, HttpStatus.BAD_REQUEST);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).headers(headers).body(errors);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleOther(Exception ex) {
		String message = ex.getMessage();
		List<String> details = new ArrayList<>();
		details.add("Book Not Found");
		details.add(ex.getMessage());
		//headers.add("desc","Missing Path variable");
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, details, HttpStatus.BAD_REQUEST);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
	}
}
