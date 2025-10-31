import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // 4. Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height of the triangle (N): ");
        int N = input.nextInt(); // read integer input

        // Loop to print right-angled triangle
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // move to next line
        }

        input.close();
    }
}
