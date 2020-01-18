import java.util.Scanner;

class GuessNumberTest {

    public static void main(String[] argv){
        String rules = "This is a simulation of a guessing game.\nThe game initializer "
                    + "thinks of an integer between 1 and 100.\n"
                    + "The game Player guesses what the integer is.\n"
                    + "If the Player guessed a number, he(she) wins.\n"
                    + "He or She gets a warning if they give less or high number than supposed to.\n";

        System.out.println(rules);
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");

        GuessNumber game = new GuessNumber();
        game.startGame();
    }
}
