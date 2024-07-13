package com.grats.pack.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserException extends RuntimeException {

	private String msg;
	
	public UserException(String msg) {
		super(msg);
		this.msg=msg;
	}
}
