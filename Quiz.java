// Step 2: Import Scanner and Random libraries
import java.util.Random;
import java.util.Scanner;

// Step 1: Create a new class named Quiz
public class Quiz {
    // Step 3: Create the main() function
    public static void main(String[] args) {
        // Step 4: Declare Scanner and Random objects
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Step 5: Add sample syntax using Scanner and Random
        // Randomize two numbers between 1 and 10
        int num1 = rand.nextInt(10) + 1;
        int num2 = rand.nextInt(10) + 1;

        System.out.println("Welcome to the Quiz!");
        System.out.println("What is the result of: " + num1 + " + " + num2 + " ?");

        // Get user answer
        System.out.print("Your answer: ");
        int answer = input.nextInt();

        // Ignore the newline character
        input.nextLine();

        // Check the answer
        if (answer == (num1 + num2)) {
            System.out.println("Correct! Great job!");
        } else {
            System.out.println("Incorrect. The correct answer is " + (num1 + num2));
        }

        System.out.println("Thanks for playing!");
    }
}
