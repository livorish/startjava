import java.util.Scanner;

class CalculatorTest {

    public static void main(String[] argv) {
        Scanner inputUser = new Scanner(System.in);
        Calculator calc = new Calculator();
        boolean flag = true;
        String answer = "";
        while(true) {
        if (answer.equals("no")) {
            break;
        } else {
            System.out.print("Input the first number: ");
            int num1 = inputUser.nextInt();
            calc.setNumberOne(num1);

            System.out.print("Input a math operator: ");
            char s = inputUser.next().charAt(0);
            calc.setOperator(s);

            System.out.print("Input the second number: ");
            int num2 = inputUser.nextInt();
            calc.setNumberTwo(num2);
            calc.checkingResult();

            System.out.println("Would you like to calculate something else? Input 'yes' or 'no'");
            answer = inputUser.next();
            }
        }
    }
}
