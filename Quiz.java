import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String continueGame;

        do {
            // Computer randomly chooses a number between 1 and 100
            int answer = rand.nextInt(100) + 1;
            int guess;

            System.out.println("=== Number Guessing Game ===");
            System.out.println("I'm thinking of a number between 1 and 100.");
            
            // Loop until the user guesses correctly
            do {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
                input.nextLine(); // ignore newline

                // Compare the guess with the answer
                if (guess > answer) {
                    System.out.println("Too high! Try again.");
                } else if (guess < answer) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("🎉 Correct! The number was " + answer + "!");
                }
            } while (guess != answer);

            // Ask if user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            continueGame = input.nextLine();

        } while (continueGame.equalsIgnoreCase("yes"));

        System.out.println("Game ended. Thanks for playing!");
    }
}
