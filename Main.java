//simple number-guessing game
import java.util.*;

public class Main {
    public static void Number_Guessing_Game() {
        int limit = 5;
        int tries = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! lets play a game!");
        System.out.println("You have to guess or choose a number between 1 to 100 within " + limit + " trials.");
        int i;
        boolean b1 = true;
        while (b1) {
            int number = 1 + (int)(100* Math.random());
            for (i = 0; i < limit; i++) {
                System.out.println("Guess a number:");

                int guess = sc.nextInt();

                // for invalid choice
                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a valid number(between 1 to 100)");
                    continue;
                }

                // if user got the correct number
                if (number == guess) {
                    if (tries > 1) {
                        System.out.println("-------------------------------------------------");
                        System.out.println("Won!!! You got the number in " + tries + " tries.");
                        System.out.println("-------------------------------------------------");
                    } else {
                        System.out.println("*****************************************");
                        System.out.println("*****************************************");
                        System.out.println("Correct! You got the number in first try.");
                        System.out.println("*****************************************");
                        System.out.println("*****************************************");
                    }
                    break;
                }
                // if the actual number is grater than guessed number
                else if (number > guess && i != limit - 1) {
                    System.out.println("The number is greater than " + guess);
                    tries++;
                }
                // if the actual number is less than guessed number
                else if (number < guess && i != limit - 1) {
                    System.out.println("The number is less than " + guess);
                    tries++;
                }
            }
            // after tried 5 times
            if (i == limit) {
                System.out.println("You lost! Maximum attempts reached as " + limit + " trials...Better luck next time!");

                System.out.println("The actual number was " + number);
            }
            System.out.println();
            System.out.println("If you want to play again then press 1 otherwise press 0:");
            int n = sc.nextInt();
            if (n == 1) {
                tries = 1;
                continue;
            } else if (n == 0) {
                b1 = false;
            }
        }
    }

    public static void main(String arg[]) {
        Number_Guessing_Game();
    }
}
