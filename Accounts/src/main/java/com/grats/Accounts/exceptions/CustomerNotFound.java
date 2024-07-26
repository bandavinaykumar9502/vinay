package com.grats.Accounts.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CustomerNotFound extends RuntimeException{
	
	private String msg;

	public CustomerNotFound(String msg) {
		super();
		this.msg = msg;
	}
	
}
