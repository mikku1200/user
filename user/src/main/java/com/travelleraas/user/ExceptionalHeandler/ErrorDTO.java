package com.travelleraas.user.ExceptionalHeandler;

import org.springframework.http.HttpStatus;

public class ErrorDTO {
	HttpStatus errorCode;
	String errorCause;
	public HttpStatus getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(HttpStatus errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCause() {
		return errorCause;
	}
	public void setErrorCause(String errorCause) {
		this.errorCause = errorCause;
	}
	public ErrorDTO(HttpStatus errorCode, String errorCause) {
		super();
		this.errorCode = errorCode;
		this.errorCause = errorCause;
	}
	

}
