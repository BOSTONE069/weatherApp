package com.bptn.weatherapp.exception;

public class UsernameExistException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UsernameExistException(String message) {
		super(message);
	}

}
