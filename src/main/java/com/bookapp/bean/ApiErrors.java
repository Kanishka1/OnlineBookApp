package com.bookapp.bean;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;



import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiErrors {

	LocalDateTime timestamp;
	String message;
	List<String> details;
	HttpStatus status;
	
}