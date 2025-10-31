import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the side length of the square (N): ");
        int N = input.nextInt();
        
        // Outer loop for rows
        for (int i = 1; i <= N; i++) {
            // Inner loop for columns
            for (int j = 1; j <= N; j++) {
                System.out.print("*");
            }
            // Move to next line after each row
            System.out.println();
        }

        input.close();
    }
}
