import java.lang.Math;

public class Calculator {

    private int num1;
    private int num2;
    private char sign;

    public void setNumberOne(int num1) {
        this.num1 = num1;
    }

    public void setNumberTwo(int num2) {
        this.num2 = num2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calculate() {
        switch(sign) {
            case '+':
                System.out.println("The sum of two numbers is equal to " + (num1 + num2));
                break;
            case '-':
                System.out.println("The difference between two numbers is equal to " + (num1 - num2));
                break;
            case '*':
                System.out.println("The product of two numbers is equal to " + (num1 * num2));
                break;
            case '/':
                System.out.println("The quotient of two numbers is equal to " + (num1 / num2));
                break;
            case '^':
                System.out.println("The power of two numbers is equal to " + ( (int) (Math.pow(num1, num2))));
                break;
            case '%':
                System.out.println("The remainder of two numbers is equal to " + (num1 % num2));
                break;
            default:
                System.out.println("Something wrong.");
        }
    }
}
