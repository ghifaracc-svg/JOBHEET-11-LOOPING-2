    // Step 4: Import Scanner class
import java.util.Scanner;

// Step 2: Create a class named Star
public class Star {
    // Step 3: Write main() function
    public static void main(String[] args) {
        
        // Step 5: Declare Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Step 6: Input value to store in variable N
        System.out.print("Enter the value of N : ");
        int N = sc.nextInt();
        
        // Step 7: Create a loop using for
        for (int i = 0; i < N; i++) {
            System.out.print("*"); // use print (not println) to display sideways
        }
        
        // Close the Scanner
        sc.close();
    }
}
