package com.bz.gambler;

public class Gambling_Simulator {
	/*
	 * Initialized variable with given values, as start stake and bet. Added random
	 * method to check win or loose.
	 */

	public int makeBet() {
		int start_stake = 100;
		int bet = 1;

		while (start_stake != 150 || start_stake != 50) {
			int bet_result = (int) (Math.random() * 10) % 2;
			if (bet_result == 0) {
				start_stake -= bet;
			} else {
				start_stake += bet;
			}
			if (start_stake == 150) {
				break;
			} else if (start_stake == 50) {
				break;
			}
		}
		return start_stake;
	}

	public void playFor20Days() {
		int total_Amount_Invested_In_20_Days = 2000;
		int amount_After_20Days = 0;
		for (int i = 1; i <= 20; i++) {
			amount_After_20Days += makeBet();
		}
		System.out.println("Amount after 20 day is " + amount_After_20Days);
		if (amount_After_20Days > total_Amount_Invested_In_20_Days) {
			int profit = amount_After_20Days - total_Amount_Invested_In_20_Days;
			System.out.println("Total profit after 20 days is = " + profit);

		} else if (amount_After_20Days < total_Amount_Invested_In_20_Days) {
			int loss = total_Amount_Invested_In_20_Days - amount_After_20Days;
			System.out.println("Total loss after 20 days is = " + loss);
		} else
			System.out.println("No profit No loss");
	}

	public static void main(String[] args) {
		Gambling_Simulator play = new Gambling_Simulator();
		play.playFor20Days();
	}
}