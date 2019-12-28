class Calculator {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		char sign = '^';
		int result = 0;
		
		if (sign == '+') {
			result = num1 + num2;
			System.out.println("The sum of two numbers is equal to " + result);
		} else if (sign == '-') {
			result = num1 - num2;
			System.out.println("The difference between two numbers is equal to " + result);
		} else if (sign == '*') {
			result = num1 * num2;
			System.out.println("The product of two numbers is equal to " + result);
		} else if (sign == '/') {
			result = num1 / num2;
			System.out.println("The quotient of two numbers is equal to " + result);
		} else if (sign == '^') {
			result = num1;
			for (int i = 1; i < num2; i++) {
				result *= num1;
			}
			System.out.println("The power of two numbers is equal to " + result);
		} else if (sign == '%') {
			result = num1 % num2;
			System.out.println("The remainder of two numbers is equal to " + result);
		}    
	}
}
