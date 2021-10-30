package com.bz.gambler;

public class Gambling_Simulator {
	/*
	 * Initialized variable with given values, as start stake and bet. Added random
	 * method to check win or loose.
	 */
	int start_stake = 100;
	int bet = 1;

	public void makeBet() {
		while (start_stake != 150 || start_stake != 50) {
			int result = (int) (Math.random() * 10) % 2;
			if (result == 0) {
				start_stake -= bet;
			}
				else {
				start_stake += bet;
		}
		if (start_stake == 150) {
			System.out.println("Won the bet:" +start_stake);
			break;
		}
		else if (start_stake == 50) {
				System.out.println("loose the bet:"+start_stake);
				break;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Wel come to Gambling Simulator Solution");
		Gambling_Simulator obj = new Gambling_Simulator();
		obj.makeBet();
	}
}
