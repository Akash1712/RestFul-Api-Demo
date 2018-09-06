package com.restfulfirst.FirstRest.NewData;

public class AccessClass {

	private String message;
	private String name;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AccessClass(String message, String name, int id) {
		super();
		this.message = message;
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "AccessClass [message=" + message + ", name=" + name + ", id=" + id + "]";
	}

}