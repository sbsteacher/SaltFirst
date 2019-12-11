package com.korea.first.blackjack;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Gamer gamer = new Gamer();
		Dealer dealer = new Dealer();
		cd.shuffle();
		
		dealer.saveCard(cd.pick());
		gamer.saveCard(cd.pick());
		dealer.saveCard(cd.pick());
		gamer.saveCard(cd.pick());
		
		dealer.moreCard(cd);
						
		//dealer.open();
		System.out.println("-----------😊😊");
		
		
		Scanner scan = new Scanner(System.in);
		String answer;
		while(true) {
			gamer.open();
			System.out.print("카드를 더 받으시겠습니까? (싫으면 : n)");
			answer = scan.next();
			if(answer.equals("n")) {
				break;
			} else {
				gamer.saveCard(cd.pick());				
			}
		}
		scan.close();		
		Rule.whoIsWin(dealer, gamer);
	}
}
