package com.korea.first.inter;

public class Siba implements Barkable, Cuterable {

	@Override
	public void bark() {
		System.out.println("시바가 짖는다!!!!");
	}

	@Override
	public void charming() {
		System.out.println("시바가 애교를 부립니다!!");
		
	}

}
