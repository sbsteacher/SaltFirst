package com.korea.first.blackjack;

public class Gamer {
	private final Card[] myCards;
	
	public Gamer() {
		myCards = new Card[49];
	}
	
	public Gamer(int len) {
		myCards = new Card[len];
	}
	
	public void saveCard(Card card) {
		for(int i=0; i<myCards.length; i++) {
			if(myCards[i] == null) {
				myCards[i] = card;
				return;
			}
		}
	}
	
	public int getSum() {
		int sum = 0;
		for(Card c : myCards) {
			if(c != null) {
				sum += c.getScore();
			}
		}
		return sum;
	}
	
	public void open() {
		int sum = 0;
		for(Card c : myCards) {
			if(c != null) {
				sum += c.getScore();
				System.out.println(c);				
			}
		}
		System.out.printf("합계 : %d\n", sum);
	}
}
