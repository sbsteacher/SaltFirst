package com.korea.first.inter;

public class AnimalTest {

	public static void main(String[] args) {
		BullDog bd = new BullDog();
		Siba si = new Siba();
		Wellsi wel = new Wellsi();
		
		play(bd);	
		play(si);
		play(wel);
		
	}
	
	public static void play(Object obj) {
		if(obj instanceof Cuterable) {
			Cuterable cu = (Cuterable)obj;
			cu.charming();
		} 
		if(obj instanceof Barkable) {
			Barkable ba = (Barkable)obj;
			ba.bark();
		}
	}
	
	
}
