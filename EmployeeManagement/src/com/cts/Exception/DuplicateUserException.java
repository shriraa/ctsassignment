package com.cts.Exception;

public class DuplicateUserException extends Exception {
	public DuplicateUserException() {
		System.out.println("User already Exists");
	}

}
