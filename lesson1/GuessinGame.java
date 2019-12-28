class GuessinGame {
	
	public static void main(String[] args) {
		int guessNumber = 5;
		int myTurn = 0;
		int endPoint = 100;
		String rules = "This is a simulation of a guessing game.\nThe game initializer "
					+ "thinks of an integer between 1 and 100.\n"
					+ "The game Player guesses what the integer is.\n"
					+ "If the Player guessed a number, he(she) wins.\n"
					+ "He or She gets a warning if they give less or high number than supposed to.\n";
		System.out.println(rules);
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-"); 
		while (myTurn <= endPoint) {
			int middle = ((endPoint - myTurn) / 2) + myTurn;
			
			if (middle == guessNumber) {
				System.out.println("Congratulations! You won! " + "The guess number was " + middle);
				break;
			}
			if (guessNumber < middle) {
				System.out.println("The number you entered is less than what the computer thought");
				endPoint = middle - 1;
			} else { 
				System.out.println("The number you entered is greater than what the computer thought");
				myTurn = middle + 1;
			}
		}
	}
}