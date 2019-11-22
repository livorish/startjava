class Cycle{
	
	public static void main(String[] argv){
		// task 1. Выведите на консоль с помощью цикла for все числа от [0, 20]
		for(int i = 0; i < 21; i++){
			System.out.println("Number: " + i);
		}
		
		// task 2. Выведите на консоль с помощью цикла while все числа от [6, -6] (шаг итерации равен 2)
		int a = 6;
		while(a > -7){
			System.out.println("Digit: " + a);
			a = a - 2;
		}

		// task 3. Выведите на консоль с помощью цикла do-while сумму всех нечетных чисел от [10, 20]
		int b = 10;
		do{
			System.out.println("Numeral: " + b);
			b++;
		} while (b < 21);
		

	}
}