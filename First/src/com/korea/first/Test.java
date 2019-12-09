package com.korea.first;

public class Test {
	public static void main(String[] dfdfddfs) {
				
		
		Test test = new Test();
		test.sum(1, 2);
		
		int result = test.multi(3, 2);
		System.out.println("result : " + result);
		//sum(1, 2); //3
		
		//int result = multi(3, 2);
		//System.out.println("result : " + result);
	}
	
	public void sum(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
	public int multi(int n1, int n2) {
		return n1 * n2;
	}
}
