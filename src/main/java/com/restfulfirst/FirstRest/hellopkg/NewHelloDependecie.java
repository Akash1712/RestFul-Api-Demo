package com.restfulfirst.FirstRest.hellopkg;

public class NewHelloDependecie {

	private String message;
	
	public NewHelloDependecie (String message) {
		
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "NewHelloDependecie [message=" + message + "]";
	}
	
	
	
}
