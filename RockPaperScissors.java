//******************************************************************************************
//RockPaperScissors.java		 	Author: Harrison Fox 
//
//Implements a class to represent and play a game of rock, paper and scissors.
//
//******************************************************************************************
import java.util.*;

// public class RockPaperScissors implements Comparable{
public class RockPaperScissors{
	private RockPaperScissorsHand userHand = new RockPaperScissorsHand();
	private RockPaperScissorsHand computerHand = new RockPaperScissorsHand();
	int gameResult;
	String outcome;

	public void play(int userChoice){
		int userHandChoice = userChoice;
		computerHand.computerChoice();
		userHand.setHand(userHandChoice);

		gameResult = computerHand.compareTo(userHand);
		
		if (gameResult == 0){
			outcome = "it's a tie!";
		}
		if (gameResult > 0){
			outcome = "the computer wins!";
		}
		if (gameResult < 0){
			outcome = "you win!";
		}
		
	}
	public String toString(){

		String gameOutcome = "You chose " + userHand + " the computer chose " + computerHand + " and " + outcome;
		
		return gameOutcome;

	}

}
