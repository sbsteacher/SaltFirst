package com.korea.first.abst;

//객체화 막는 방법 (2)
public abstract class Tv {
	protected int volumn;
	
	public void showVolumn() {
		System.out.println("volumn : " + volumn);
	}
	
	public abstract void volumnUp();
	public abstract void volumnDown();
}

