import java.lang.Math;

public class GuessNumber {

    private int max = 100;
    private int min = 1;
    private int range = max - min + 1;
    private int guessNumber = (int)(Math.random() * range) + min;

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

    public void startGame() {
        //create 2 players to play
        System.out.println("Type your number my first player: ");
        Player player1 = new Player();
        System.out.println("Type your number my second player: ");
        Player player2 = new Player();
        System.out.println("Name of the first (1) player is: " + player1.getName());
        System.out.println("Name of the second (2) player is: " + player2.getName());

        while(true){
            System.out.println(player1.getName() + ", input a namber, please" );
            int num1 = player1.receivedNumber();

            System.out.println("Player " + player1.getName() + " entered " + player1.getNumber());
            boolean checkNum1 = checkOut(num1);
            if(checkNum1) {
               break;
            }
            System.out.println(player2.getName() + ", input a namber, please" );
            int num2 = player2.receivedNumber();

            System.out.println("Player " + player2.getName() + " entered " + player2.getNumber());
            boolean checkNum2 = checkOut(num2);
            if(checkNum2) {
               break;
            }
        }
    }
}

