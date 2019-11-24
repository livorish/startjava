class ConditionalStatement {
	
	public static void main(String[] argv) {				
		int age = 21;
		if (age > 20) {
			System.out.println("You are an adult. Welcome! ");
		}
		
		boolean isItaMan = true;
		if (isItaMan) {
			System.out.println("You are a man");
		} 
		
		if (!isItaMan) {
			System.out.println("You are not a man.");
		}
		
		float growth = 1.20f;
		if (growth < 1.80) {
			System.out.println("You are short.");
		} else {
			System.out.println("Wow, you are tall!");
		}
		
		char firstLetterOfName = 'O';
		if (firstLetterOfName == 'M') {
			System.out.println("Your name starts with the letter M");
		} else if (firstLetterOfName == 'I') {
			System.out.println("Your name starts with the letter I");
		} else {
			System.out.println("Your name starts with an unknown letter");
		}	
	}
}