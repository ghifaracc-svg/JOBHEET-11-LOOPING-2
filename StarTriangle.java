import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N (minimum 5): ");
        int N = input.nextInt();

        if (N < 5) {
            System.out.println("N must be at least 5.");
            return;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
