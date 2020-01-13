import java.lang.Math;

public class Calculator {

    int result;

    char takeSign(char sign){
        return sign;
    }

    int addNumbers(int num1, int num2) {
        this.result = num1 + num2;
        return this.result;
    }

    int subtractNumbers(int num1, int num2) {
        this.result = num1 - num2;
        return this.result;
    }

    int multiplyNumbers(int num1, int num2) {
        this.result = num1 * num2;
        return this.result;
    }

    int divideNumbers(int num1, int num2) {
        this.result = num1 / num2;
        return this.result;
    }

    int powerNumbers(int num1, int num2) {
        this.result = (int) (Math.pow(num1, num2));
        return this.result;
    }

    int remaindNumbers(int num1, int num2) {
        this.result = num1 % num2;
        return this.result;
    }
}
