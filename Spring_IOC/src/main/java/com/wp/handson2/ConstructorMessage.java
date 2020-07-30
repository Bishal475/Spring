package com.wp.handson2;

public class ConstructorMessage {

	private String msg;

	public ConstructorMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConstructorMessage(String msg) {
		super();
		this.msg = msg;
	}
	
	void display() {
		System.out.println(msg);
	}
}
