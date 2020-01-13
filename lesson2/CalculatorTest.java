import java.util.Scanner;

class CalculatorTest {

    public static void main(String[] argv) {
        checkingResult();
    }

    public static void checkingResult() {
        Scanner inputUser = new Scanner(System.in);
        Calculator task = new Calculator();
        int num1 = inputUser.nextInt();
        char s = inputUser.next().charAt(0);
        int num2 = inputUser.nextInt();

        System.out.println("Введите первое число: " + num1);
        System.out.println("Введите знак математической операции: " + s);
        System.out.println("Введите второе число: " + num2);

        char sign = task.takeSign(s);
        switch(sign) {
            case '+':
                System.out.println("The sum of two numbers is equal to " + task.addNumbers(num1, num2));
                break;
            case '-':
                System.out.println("The difference between two numbers is equal to " + task.subtractNumbers(num1, num2));
                break;
            case '*':
                System.out.println("The product of two numbers is equal to " + task.multiplyNumbers(num1, num2));
                break;
            case '/':
                System.out.println("The quotient of two numbers is equal to " + task.divideNumbers(num1, num2));
                break;
            case '^':
                System.out.println("The power of two numbers is equal to " + task.powerNumbers(num1, num2));
                break;
            case '%':
                System.out.println("The remainder of two numbers is equal to " + task.remaindNumbers(num1, num2));
                break;
            default:
                System.out.println("Something wrong");
        }
    }
}
