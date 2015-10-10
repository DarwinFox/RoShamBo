//******************************************************************************************
//RockPaperScissorsHand.java		 	Author: Harrison Fox 
//
//Implements a class to represent and play a game of rock, paper and scissors.
//
//******************************************************************************************

import java.util.*;

public class RockPaperScissorsHand implements Comparable{
	private enum Hand {rock, paper, scissors};
	private Hand hand;

	public void setHand(int userChoice){
		int choice = userChoice;
		
		switch (choice){
			case 0:
				hand = Hand.rock;
				break;
			case 1:
				hand = Hand.paper;
				break;
			case 2:
				hand = Hand.scissors;
				break;
			default:
				hand = null;
		}
	}

	public void computerChoice(){
		Random generator = new Random();
		int choice = generator.nextInt(3);

		switch (choice){
			case 0:
				hand = Hand.rock;
				break;
			case 1:
				hand = Hand.paper;
				break;
			case 2:
				hand = Hand.scissors;
				break;
		}
	}

	public Hand getHand(){
		return hand;
	}

	public int compareTo(RockPaperScissorsHand handToCompare) {
		Hand firstHand = this.getHand();
		Hand secondHand = handToCompare.getHand(); 


		int result = 0;
		if (firstHand == Hand.rock && secondHand == Hand.scissors){
			result = 1;
			System.out.println("test1");
		}
		if (firstHand == Hand.scissors && secondHand == Hand.paper){
			result = 1;
		}
		if (firstHand == Hand.paper && secondHand == Hand.rock){
			result = 1;
		}
		if (firstHand == Hand.rock && secondHand == Hand.rock){
			result = 0;
		}
		if (firstHand == Hand.scissors && secondHand == Hand.scissors){
			result = 0;
		}
		if (firstHand == Hand.paper && secondHand == Hand.paper){
			result = 0;
		}
		if (firstHand == Hand.scissors && secondHand == Hand.rock){
			result = -1;
		}
		if (firstHand == Hand.paper && secondHand == Hand.scissors){
			result = -1;
		}
		if (firstHand == Hand.rock && secondHand == Hand.paper){
			result = -1;
		}

		return result;
	}

	public String toString(){

		String response = "" +hand;

		return response;

	}
}
