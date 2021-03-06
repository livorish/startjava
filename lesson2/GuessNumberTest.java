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
        // fitst player
        Scanner input = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name1 = input.nextLine();
        Player player1 = new Player(name1);
        System.out.println("Name of the first (1) player is: " + player1.getName());
        // second player
        System.out.print("Type your name: ");
        String name2 = input.nextLine();
        Player player2 = new Player(name2);
        System.out.println("Name of the second (2) player is: " + player2.getName());
        // Create a game
        GuessNumber play = new GuessNumber(player1, player2);
        play.startGame();
    }
}
