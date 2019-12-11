package com.korea.first.blackjack;

public class Dealer extends Gamer {
	public Dealer() {
		super(3);
	}
	
	public void moreCard(CardDeck cd) {
		//단, 2카드의 합계 점수가 16점 이하이면 반드시 1장을 추가로 뽑고
		//, 17점 이상이면 받을 수 없다.
		int mySum = getSum();
		if(mySum <= 16) {
			saveCard(cd.pick());
		}
	}
}
