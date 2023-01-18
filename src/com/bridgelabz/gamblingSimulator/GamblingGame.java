package com.bridgelabz.gamblingSimulator;
import java.util.Random;
public class GamblingGame {

	public static final int INITIAL_BET = 100;
	public static final int STAKE_BET = 1;
	static Random random = new Random();
	public static final int percentage =  50;

	public static final int HIGHEST_STAKE = percentage + INITIAL_BET;
	public static final int LOWEST_STAKE = INITIAL_BET - percentage;


	public static void main(String[] args) {

		int Total_Stake =INITIAL_BET;

		while (Total_Stake < HIGHEST_STAKE && Total_Stake >LOWEST_STAKE ) {
			int play = random.nextInt(2); // generate random number in range 0,1

			switch (play) {

			case 0:
				Total_Stake = Total_Stake - STAKE_BET;
				System.out.println("Stake after loosing: " + Total_Stake); // print result
				break;

			case 1:
				Total_Stake = Total_Stake + STAKE_BET;
				System.out.println("Stake after winning: " + Total_Stake);
				break;
			}

		}
		// if will get the bet is won or loss
		if (Total_Stake == HIGHEST_STAKE)
			System.out.println("Gambler won by: " + Total_Stake);
		else
			System.out.println("Gambler lost by: " + Total_Stake);
	}


	
}
