package com.qa.myblackjack;

public class BlackJack {

	public static void main(String[] args) {

	}

	public int play(int player, int dealer) {

	
		if (player > dealer && player <= 21 && dealer <= 21 && player > 0 && dealer > 0) {
			return player;
		} 
		if (dealer > player && dealer <= 21 && player <= 21 && dealer > 0 && player > 0) {
			return dealer;
		} 
		if (player <= 21 && player > 0 && dealer > 0 && dealer < 32) {
			return player;
		}
		if (dealer <= 21 && player > 0 && dealer > 0 && player < 32) {
			return dealer;
		}
		if (player < 0 || dealer < 0 || player > 31 || dealer > 31) {
			return 0;
		} 
		else {
			return 0;
		}
	}
}
