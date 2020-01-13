import java.lang.Math;

public class GuessNumber {

    private int max = 100;
    private int min = 1;
    private int range = max - min + 1;
    private int guessNumber = (int)(Math.random() * range) + min;
    private int playerMove;
    private String result;

    public int getGuessNum() {
        return guessNumber;
    }

    public boolean checkOut(int playerMove) {
        if(playerMove < guessNumber) {
            System.out.println("It's less than the guess number.");
            return false;
        } else if (playerMove > guessNumber) {
            System.out.println("It's more than the guess number.");
            return false;
        }
        System.out.println("Congratulation! You won!");
        return true;
    }
}

