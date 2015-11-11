var userChoice = prompt("Do you choose rock, paper or scissors?");
if (userChoice === "rock" || userChoice === "paper" || userChoice === "scissors"){
    console.log("Get ready to play!");
}
else{
    userChoice = prompt("You did not enter one of the three possible entries, please try again.");
}

var computerChoice = Math.random();
if (computerChoice < 0.34) {
	computerChoice = "rock";
} else if(computerChoice <= 0.67) {
	computerChoice = "paper";
} else {
	computerChoice = "scissors";
} console.log("Computer: " + computerChoice);

var compare = function (choice1, choice2){
    if (choice1 === choice2){
        userChoice = prompt("The result is a tie! Try again!");
        computerChoice = Math.random();
        if (computerChoice < 0.34) {
	        computerChoice = "rock";
        } else if(computerChoice <= 0.67) {
	        computerChoice = "paper";
        } else {
	        computerChoice = "scissors";
        } console.log("Computer: " + computerChoice);
         compare(userChoice, computerChoice);
    }
    else if (choice1 === "rock") {
        if (choice2 === "scissors"){
            return "rock wins!";
        }
        else{
            return "paper wins!";
        }
    }
    else if (choice1 === "paper"){
        if (choice2 === "rock"){
            return "Paper wins!";
        }
        else{
            return "scissors wins!";
        }
    }
    else if (choice1 === "scissors"){
        if (choice2 === "rock"){
            return "rock wins!";
        }
        else{
            return "scissors wins!";
        }
    }
};

compare(userChoice, computerChoice);

