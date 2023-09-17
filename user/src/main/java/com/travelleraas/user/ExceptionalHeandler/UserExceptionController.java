package com.travelleraas.user.ExceptionalHeandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserExceptionController {
	 @ExceptionHandler(value = UserNotFoundException.class)
	   public ErrorDTO exception(UserNotFoundException exception) {
	      return new ErrorDTO (HttpStatus.NOT_FOUND,"User not found");
	   }

}
