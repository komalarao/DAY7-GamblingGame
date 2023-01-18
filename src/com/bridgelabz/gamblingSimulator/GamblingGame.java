package com.bridgelabz.gamblingSimulator;
import java.util.Random;
public class GamblingGame {

	public static final int INITIAL_BET = 100;
	public static final int STAKE_BET = 1;
	static Random random = new Random();

	public static void main(String[] args) {

		int totalStake = INITIAL_BET;

		int play = random.nextInt(2); // generate random number in range 0,1

		switch (play) {

		case 0:
			totalStake = totalStake -STAKE_BET ;
			System.out.println("Stake after loosing: " + totalStake); // print result
			break;

		case 1:
			totalStake = totalStake + STAKE_BET;
			System.out.println("Stake after winning: " + totalStake);
			break;
		}

	}

	
}
