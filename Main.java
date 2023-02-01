//simple number-guessing game
import java.util.*;

public class Main {
    public static void Number_Guessing_Game() {
        int number = 1 + (int)(100* Math.random());
        int limit = 5;
        int tries = 1;

        System.out.println("You have to guess or choose a number between 1 to 100 within " + limit + " trials.");
        int i;
        for (i = 0; i < limit; i++) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Guess a number:");

            int guess = sc.nextInt();

            //for invalid choice
            if(guess < 1 || guess > 100) {
                System.out.println("Please enter a valid number(between 1 to 100)");
                continue;
            }

            //if user got the correct number 
            if (number == guess) {
                if (tries > 1) {
                    System.out.println("You got the number in " + tries + " tries.");
                } 
                else {
                    System.out.println("You got the number in first try.");
                }
                break;
            } 
            //if the actual number is grater than guessed number  
            else if (number > guess && i != limit - 1) {
                System.out.println("The number is greater than " + guess);
                tries++;
            } 
            //if the actual number is less than guessed number 
            else if (number < guess && i != limit - 1) {
                System.out.println("The number is less than " + guess);
                tries++;
            }
        }
        //after tried 5 times
        if (i == limit) {
            System.out.println("You lost! Maximum attempts reached as " + limit + " trials...Better luck next time!");

            System.out.println("The actual number was " + number);
        }
    }
    public static void main(String arg[]) {
        Number_Guessing_Game();
    }
}
