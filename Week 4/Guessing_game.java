import java.util.Random;
import java.util.Scanner;

class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1; // Random number  between 1-100
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("Guess a number between 1 and 100:");

        while (guess != secret) {
            System.out.print("Your guess: ");
            guess = scanner.nextInt();

            if (guess < secret) {
                System.out.println("Larger!");
            } else if (guess > secret) {
                System.out.println("Smaller!");
            } else {
                System.out.println("Correct! The number was " + secret);
            }
        }

        scanner.close();
    }
}