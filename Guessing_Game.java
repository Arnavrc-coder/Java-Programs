import java.util.Random;
import java.util.Scanner;

public class Guessing_Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int c = random.nextInt(100);  // Random number between 0 and 99

        System.out.println("Guess the number between 0 and 99!");
        System.out.println("You have 5 chances to guess the correct number.");

        boolean guessedCorrectly = false;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Attempt " + i + ": Enter your guess: ");
            int guess_number = scanner.nextInt();

            if (guess_number == c) {
                System.out.println("Congratulations! Your guess is correct.");
                guessedCorrectly = true;
                break; // exit the loop if guessed correctly
            } else {
                System.out.println("Incorrect guess.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Sorry, you are out of attempts.");
        }

        System.out.println("The correct number was: " + c);
        scanner.close();
    }
}
