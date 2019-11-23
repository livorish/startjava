import java.util.*;

class ConditionalStatement {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] argv) {
		
		int age;
		char sex;
		float growth;
		char firstLetterOfName;
		
		
		System.out.println("Type your age:");
		age = reader.nextInt();
		
		if(age > 20) {
			System.out.println("You are an adult. Welcome! ");
		}
		
		System.out.println("Mark your gender (m/f/o): ");
		sex = reader.next().charAt(0);
		
		if(sex == 'm'){
			System.out.println("You are a man");
		} else if (sex == 'f'){
			System.out.println("You are a woman");
		} else {
			System.out.println("You are neither man nor woman. Who are you?");
		}
		
		System.out.println("Enter your height: ");
		growth = reader.nextFloat(); 
		if(growth < 1.80){
			System.out.println("You are short.");
		} else {
			System.out.println("Wow, you are tall!");
		}
		
		System.out.println("Enter your first name: ");
		firstLetterOfName = reader.next().charAt(0); 
		
		if(firstLetterOfName == 'M'){
			System.out.println("Your name starts with the letter M");
		}  else if (firstLetterOfName == 'I') {
			System.out.println("Your name starts with the letter I");
		} else {
			System.out.println("Your name starts with an unknown letter");
		}

		
	}
}
