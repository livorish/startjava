import java.util.Scanner;
public class Player {

    private String name;
    private int number;
    Scanner input = new Scanner(System.in);

    public Player() {
        this.name = input.nextLine();
     }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int receivedNumber() {
        this.number = input.nextInt();
        return number;
    }
}
