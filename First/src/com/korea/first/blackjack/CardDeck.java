package com.korea.first.blackjack;

public class CardDeck {
	private Card[] cards;
	
	public CardDeck() {
		super();
		init();
	}
	
	private void init() {
		cards = new Card[52];
		
		//52장 카드를 생성!!!!
		String[] shapes = {"Spade", "Heart", "Clover", "Diamond"};
		final int CARD_LEN = 13;
		int idx = 0;
		for(int i=0; i<shapes.length; i++) {
			for(int z=1; z<=CARD_LEN; z++) {
				Card c = new Card(shapes[i], z);
				cards[idx++] = c;
			}
		}
	}
	
	public Card pick() {
		Card c = null;
		for(int i=0 ; i<cards.length; i++) {
			if(cards[i] != null) {
				c = cards[i];
				cards[i] = null;
				break;
			}
		}
		return c;
	}
	
	public void shuffle() {
		int cardLen = cards.length;
		//0~51
		//0~1미만인 실수 double
		for(int i=0; i<cardLen; i++) {
			int rIdx = (int)(Math.random() * cardLen);
			
			Card temp = cards[i];
			cards[i] = cards[rIdx];
			cards[rIdx] = temp;
		}
	}
	
	public void printAll() {
		for(Card c : cards) {
			System.out.println(c);
		}
	}
}
