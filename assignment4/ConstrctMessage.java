package com.springioc.assignment4;

public class ConstrctMessage {

	String message=null;

	public ConstrctMessage(String message) {
		super();
		System.out.println("constructor called");
		this.message = message;
	}

	@Override
	public String toString() {
		return "ConstructorMessage [message=" + message + "]";
	}
}
