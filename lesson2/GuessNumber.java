import java.lang.Math;
import java.util.Scanner;
public class GuessNumber {

    Scanner input = new Scanner(System.in);
    private int max = 100;
    private int min = 1;
    private int range = max - min + 1;
    private int guessNumber = (int)(Math.random() * range) + min;
    private String name;

    public String getTurnPlayer() {
        return name;
    }

    public String setTurnPlayer(String name) {
        this.name = name;
        return name;
    }

    public int receivedNumber() {
        System.out.print("Please, type your number, " + name + ": ");
        int number = input.nextInt();
        return number;
    }

    public boolean checkOut(int number) {
        if(number < guessNumber) {
            System.out.println("It's less than the guess number, " + name);
            return false;
        } else if (number > guessNumber) {
            System.out.println("It's more than the guess number, " + name);
            return false;
        }
        System.out.println("Congratulation! You won! " + name);
        return true;
    }
}

