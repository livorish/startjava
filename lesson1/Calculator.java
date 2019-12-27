class Calculator {
	
	public static void main(String[] args) {
		int term1 = 10;
		int term2 = 3;
		char sign = '^';
		int result = 0;
		
		if (sign == '+') {
			result = term1 + term2;
			System.out.println("The sum of two numbers is equal to " + result);
		} else if (sign == '-') {
			result = term1 - term2;
			System.out.println("The difference between two numbers is equal to " + result);
		} else if (sign == '*') {
			result = term1 * term2;
			System.out.println("The product of two numbers is equal to " + result);
		} else if (sign == '/') {
			result = term1 / term2;
			System.out.println("The quotient of two numbers is equal to " + result);
		} else if (sign == '^') {
			result = term1;
			for (int i = 1; i < term2; i++) {
				result *= term1;
			}
			System.out.println("The power of two numbers is equal to " + result);
		} else if (sign == '%') {
			result = term1 % term2;
			System.out.println("The remainder of two numbers is equal to " + result);
		}    
	}
}
