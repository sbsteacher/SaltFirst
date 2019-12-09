package com.korea.first.obj;

public class Suv extends Car {
		
	public Suv(String name) {
		super(name);
	}
	
	@Override
	public void drive() {				
		System.out.printf("%s is driving\n", getName());
	}
	
	public void climb() {
		System.out.println("동산을 올라가다");
	}
}
