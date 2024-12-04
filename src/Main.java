import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomNum;
        randomNum = (int) (Math.random() * 100);
        int myNumber = 0;
        System.out.println("Guess the number from 1 to 100");
        do {
            Scanner input = new Scanner(System.in);
            myNumber = input.nextInt();

            if (myNumber == randomNum) {
                System.out.println("You guessed the number from 1 to 100");
                break;
            }

            else if (myNumber > randomNum) {
                System.out.println("Think smaller!");
            }

            else {
                System.out.println("Think larger!");
            }

        } while (myNumber > 0);

        if (myNumber < 0) {
            System.out.println(" The number was " + randomNum);
        }
    }
}