//******************************************************************************************
//RoShamBo.java		 	Author: Harrison Fox 
//
//Implements a main method to play a game of rock, paper and scissors.
//******************************************************************************************
import java.util.*;

public class RoShamBo{

	public static void main(String[] args){

		String userInput;
		int num;
		int done = 1;
		Scanner scan = new Scanner (System.in);

		System.out.println("Welcome to RoShamBo would you like to play a game?");
		System.out.println("Please enter 1 for \"Yes\" and 0 for \"No\"");
		userInput = scan.next();

		IntTest test = new IntTest(userInput);
		if(test.isValid()){
			done = test.getInt();
		}
		else{
			done = 0;
		}

		while (done > 0){

			System.out.println("Please choose a hand for RoShamBo, 0 for Rock, 1 for Paper, and 2 for Scissors");
			userInput = scan.next();

			test.intTest(userInput);	
			num = test.getInt();

			if (test.isValid() && num >= 0 && num <= 2){ // This if statement provides proper bounds checking for the number entered
				RockPaperScissors game = new RockPaperScissors();

				// game.computerChoice();
				// game.setHand(num);
				game.play(num);

				System.out.println(game);

			}
			else{
				System.out.println("The number you entered is not a value greater than or equal to 0 or less than 3.");
			}

			System.out.println("Would you like to play another game??");
			System.out.println("Please enter 1 for \"Yes\" and 0 for \"No\"");
			userInput = scan.next();
			if(test.intTest(userInput)){
				done = test.getInt();
			}
			else{
			done = 0;
			}
		}
		
		System.out.println();
		System.out.println("Thank you for playing!" + "\n");
	}	
}
