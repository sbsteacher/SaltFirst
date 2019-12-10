package com.korea.first.abst;

public class SamsungTv extends Tv {

	@Override
	public void volumnUp() {
		volumn++;
	}

	@Override
	public void volumnDown() {		
		volumn--;
	}
}
