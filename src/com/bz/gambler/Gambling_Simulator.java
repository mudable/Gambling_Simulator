package com.bz.gambler;

public class Gambling_Simulator {
	/*
	 * Initialized variable with given values, as start stake and bet.
	 * Added random method to check win or loose.
	 */
	int start_stake = 100;
	int bet = 1;

	public void makeBet() {
		int result = (int) (Math.random() * 10) % 2;
		if (result == 0) {
			start_stake -= 1;
		} else
			start_stake += 1;
	}

	public static void main(String[] args) {
		System.out.println("Wel come to Gambling Simulator Solution");
		Gambling_Simulator obj = new Gambling_Simulator();
		obj.makeBet();
	}
}
