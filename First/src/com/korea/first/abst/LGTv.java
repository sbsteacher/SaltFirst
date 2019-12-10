package com.korea.first.abst;

public class LGTv extends Tv {

	@Override
	public void volumnUp() {
		volumn += 2;
	}

	@Override
	public void volumnDown() {
		volumn -= 2;		
	}
	
	public void play() {
		System.out.println("재생!!!");
	}
}
