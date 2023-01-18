package com.bridgelabz.gamblingSimulator;
import java.util.Random;
public class GamblingGame {

	public static final int STAKE = 100;
	public static final int BET = 1;
	public static final int percentage =   50;
	public static final int HIGH_LIMIT = STAKE + percentage;
	public static final int LOW_LIMIT = STAKE - percentage;
	public static final int START_DAY = 1;
	public static final int END_DAY = 20;
	public static final int STAKES_PER_DAY = 50;
	public static final int START_DOLLARS = 0;

	public static void main(String[] args) {

		System.out.println("Welcome to the Gambler Game"); // print
		// Initialize
		int days = START_DAY;
		int totalDollars = START_DOLLARS;

		for (days = START_DAY; days <= END_DAY; days++) {
			int totalStake = STAKE;

			while (totalStake < HIGH_LIMIT && totalStake > LOW_LIMIT) {
				int luck = (int) (Math.random() * 10) % 2;
				if (luck == 1) {
					totalStake = totalStake + BET;
				} else {
					totalStake = totalStake - BET;
				}
			}

			// It will get the dollars is win or lose

			if (totalStake == HIGH_LIMIT) {
				totalDollars += STAKES_PER_DAY;
				System.out.println("Gambler won by " + totalDollars + " dollars on day " + days);
			} else {
				totalDollars -= STAKES_PER_DAY;
				System.out.println("Gambler lost by " + totalDollars + " dollars on day " + days);
			}
		}
		/**
		 * if loop we have to check desired dollars and print result
		 */
		if (totalDollars > START_DOLLARS) {
			System.out.println("Gambler won " + totalDollars);
		} else {
			System.out.println("Gambler lost " + totalDollars);
		}
	}

	
}
