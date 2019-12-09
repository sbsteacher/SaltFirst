package com.korea.first.obj;

public class CarTest2 {

	public static void main(String[] args) {
		Car car1 = new Car("티코");
		//car1.climb();
		car1.getName();
		car1.drive();
		
		Car car2 = new Suv("투싼");
		//car2.climb();
		Suv suv1 = (Suv)car2;
		suv1.climb();
		
		Car car3 = new Santafe();
		//car3.load();
		
		//Santafe suv1 = (Santafe)car2; //런타임 에러		
		//Santafe san1 = new Suv("투싼"); //컴파일 에러

	}

}
