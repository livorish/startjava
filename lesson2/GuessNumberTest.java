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

        Scanner inputUser = new Scanner(System.in);
        System.out.println("Input your name: ");
        String playerName1 = inputUser.nextLine();
        System.out.println("Input your name: ");
        String playerName2 = inputUser.nextLine();
        Player player1 = new Player(playerName1);
        Player player2 = new Player(playerName2);
        System.out.println("Name of the first (1) player is: " + player1.getName());
        System.out.println("Name of the second (2) player is: " + player2.getName());

        GuessNumber checker = new GuessNumber();
        while (true) {
            System.out.println(player1.getName() + ", input a namber, please" );
            int player1Move = inputUser.nextInt();
            System.out.println("Player " + player1.getName() + " entered " + player1Move);
            boolean checkNum1 = checker.checkOut(player1Move);
            if(checkNum1) {
                break;
            }
            System.out.println(player2.getName() + ", input a namber, please.");
            int player2Move = inputUser.nextInt();
            System.out.println("Player " + player2.getName() + " entered " + player2Move);
            boolean checkNum2 = checker.checkOut(player2Move);
            if(checkNum2) {
                break;
            }
        }
    }
}
