import java.util.Scanner;
import java.lang.*;
class CalculatorTest {

    public static void main(String[] argv) {
        Scanner inputUser = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer = "yes";

        while(!answer.equals("no")) {
                if (answer.equals("yes")){
                    System.out.print("Input the first number: ");
                    int num1 = inputUser.nextInt();
                    calc.setNumberOne(num1);

                    System.out.print("Input a math operator: ");
                    char sign = inputUser.next().charAt(0);
                    calc.setSign(sign);

                    System.out.print("Input the second number: ");
                    int num2 = inputUser.nextInt();
                    calc.setNumberTwo(num2);
                    calc.calculate();
                    System.out.println("Would you like to calculate something else? Input 'yes' or 'no'");
                    answer = inputUser.nextLine().trim().replaceAll("[^\\w ]", "");
                }
                answer = inputUser.nextLine().replaceAll(" ", "");
                if ( answer.equals("no") || answer.equals("yes") ) {
                    continue;
                } else {
                    System.out.println("would you like to calculate something else? Input 'yes' or 'no'");
                }
        }
    }
}
