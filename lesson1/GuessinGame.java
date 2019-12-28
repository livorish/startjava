class GuessinGame {
	
	public static void main(String[] args) {
		int guessNumber = 88;
		int myTurn = 25;
		boolean flag = false;
		String rules = "This is a simulation of a guessing game.\nThe game initializer "
					+ "thinks of an integer between 1 and 100.\n"
					+ "The game Player guesses what the integer is.\n"
					+ "If the Player guessed a number, he(she) wins.\n"
					+ "He or She gets a warning if they give less or high number than supposed to.\n";
		System.out.println(rules);
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-"); 
		while (!flag) {
			if (myTurn < guessNumber) {
				myTurn = 90;
				System.out.println("The number you entered is less than what the computer thought");
				if (myTurn > guessNumber) {
					myTurn = 12;
					System.out.println("The number you entered is greater than what the computer thought");
				} if (myTurn < guessNumber) {
					myTurn = 98;
					System.out.println("The number you entered is less than what the computer thought");
				} if (myTurn > guessNumber) {
					myTurn = 43;
					System.out.println("The number you entered is greater than what the computer thought");
				} if (myTurn < guessNumber) {
					myTurn = 88;
					System.out.println("The number you entered is less than what the computer thought");
				} 
			}  else if (myTurn == guessNumber) {
				flag = true;
				System.out.println("Congratulations! You won!");
			}
		}
	}
}