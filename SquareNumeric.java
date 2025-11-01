import java.util.Scanner;

public class SquareNumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N (minimum 3): ");
        int N = input.nextInt();

        if (N < 3) {
            System.out.println("N must be at least 3.");
            return;
        }

        for (int i = 1; i <= N; i++) {          // outer loop for rows
            for (int j = 1; j <= N; j++) {      // inner loop for columns
                System.out.print(N + " ");
            }
            System.out.println();                // move to the next line
        }
    }
}
