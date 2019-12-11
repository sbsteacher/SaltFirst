package com.korea.first.blackjack;

public class Card {
	private final String shape;
	private final String no;
	private final int score;
	
	//idx : 1~13 사이에 숫자를 받는다.
	public Card(final String shape, int idx) {		
		this.shape = shape;
		if(idx <= 10) {
			score = idx;			
			if(idx == 1) {
				no = "A";
			} else {
				no = Integer.toString(idx);
			}
		} else {
			score = 10;
			switch(idx) {
			case 11:
				no = "J";
				break;
			case 12:
				no = "Q";
				break;
			default:
				no = "K";
				break;
			}
		}
	}
	
	public int getScore() {
		return score;
	}

	//스페이드 (1)
	@Override
	public String toString() {
		return String.format("%s (%s) %d", shape, no, score);
	}
	
}
