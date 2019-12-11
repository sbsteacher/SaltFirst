package com.korea.first.blackjack;

public class Game {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Gamer gamer = new Gamer();
		cd.shuffle();
		
		Card c = cd.pick();
		gamer.saveCard(c);
		
		gamer.saveCard(cd.pick());
				
		
		System.out.println("-----------");
		gamer.open();
		
	}

}
