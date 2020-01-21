import java.lang.Math;
import java.util.Scanner;
public class GuessNumber {

    private int max = 100;
    private int min = 1;
    private int range = max - min + 1;
    private int guessNumber = (int)(Math.random() * range) + min;
    private Player player1;
    private Player player2;
    private String playerName;
    String answer = "yes";
    Scanner input = new Scanner(System.in);

    public GuessNumber (Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    // private String passingName() {
    //     String name;
    //     if (turn) {
    //         name = this.player1.getName();
    //     } else {
    //         name = this.player2.getName();
    //     }
    //     turn = !turn;
    //     return name;
    // }
    private String passingName() {
        return playerName;
    }

    private boolean checkOut(int number) {
        if(number < guessNumber) {
            System.out.println("It's less than the guess number, " + passingName());
            return false;
        } else if (number > guessNumber) {
            System.out.println("It's more than the guess number, " + passingName());
            return false;
        }
        System.out.println("Congratulation! You won, " + passingName() + "!");
        return true;
    }

    public void startGame(){
        while(!answer.equals("no")){
            if (answer.equals("yes")){
                System.out.print("Please, type your number, " + player1.getName() + ": ");
                int number1 = input.nextInt();
                int num1 = player1.setNumber(number1);
                playerName = player1.getName();
                boolean digit1 = checkOut(num1);
                if(digit1) {
                    break;
                }
                System.out.print("Please, type your number, " + player2.getName() + ": ");
                int number2 = input.nextInt();
                int num2 = player2.setNumber(number2);
                playerName = player2.getName();
                boolean digit2 = checkOut(num2);
                if(digit2) {
                    break;
                }
                System.out.println("Would you like to continue? Input 'yes' or 'no', " + passingName());
                answer = input.nextLine().trim().replaceAll("[^\\w ]", "");
            }
            answer = input.nextLine().replaceAll(" ", "");
            if ( answer.equals("no") || answer.equals("yes") ) {
                continue;
            } else {
                System.out.println("would you like to calculate something else? Input 'yes' or 'no', " + passingName());
            }
        }
    }
}
