package com.korea.first.obj;

public class Santafe extends Suv {
	public Santafe() {
		super("싼타페");
	}
	
	public void load() {
		System.out.println("짐을 적재!!!");
	}
	
	@Override
	public void drive() {				
		System.out.printf("%s 겁나 달린다.\n", getName());
	}
}
