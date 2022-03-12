package com.desafiolatam.model;

public class Student {

	// Atributos
	private String name;
	private int rollNo;

	// Constructor
	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	// Getters y Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

}
