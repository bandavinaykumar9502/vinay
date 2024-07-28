package com.pack.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ProductNotFound extends RuntimeException {

	private String msg;

	public ProductNotFound(String msg) {
		super();
		this.msg = msg;
	}
	
	
}
