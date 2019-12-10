package com.korea.first.obj;

public class CarTest4 {

	public static void main(String[] args) {
		Santafe santa1 = new Santafe();
		Suv suv1 = new Suv("투싼");
		Car car1 = new Car("티코");
		
		ddd(santa1);
		ddd(suv1);
		ddd(car1);
		
		System.out.println(suv1 instanceof Santafe);
		System.out.println(suv1 instanceof Car);
		
		//climb
		ggg(car1);
		ggg(suv1);
		ggg(santa1);
	}
	
	public static void ggg(Car car) {
		
		if(car instanceof Suv) {
			Suv suv = (Suv)car;
			suv.climb();
		} else {			
			System.out.println(car.getName() + "은 올라갈 수 없음");
		}
	}
	
	public static void ddd(Car car) {
		car.drive();
	}

}
