package com.korea.first.obj;

public class CarTest4 {

	public static void main(String[] args) {
		Santafe santa1 = new Santafe();
		Suv suv1 = new Suv("투싼");
		Car car1 = new Car("티코");
		
		ddd(santa1);
		ddd(suv1);
		ddd(car1);
	}
	
	public static void ddd(Car car) {
		car.drive();
	}

}
