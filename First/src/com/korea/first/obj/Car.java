package com.korea.first.obj;

public class Car {
	private String name;
		
	public Car(String name) {
		this.name = name;
	}
		
	public String getName() {
		return name;
	}

	public void drive() {
		/*
			PrintStream ps = System.out;
			ps.println("ddddd");
		*/
		
		
		System.out.printf("%s는 달린다\n", name);
	}
}
