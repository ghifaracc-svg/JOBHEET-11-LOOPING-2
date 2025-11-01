import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Nested Loop Pattern Menu ===");
            System.out.println("1. Numeric Triangle");
            System.out.println("2. Star Triangle");
            System.out.println("3. Square Number");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter N: ");
                    int N = input.nextInt();
                    for (int i = 1; i <= N; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(j);
                        }
                        System.out.println();
                    }
                }
                case 2 -> {
                    System.out.print("Enter N: ");
                    int N = input.nextInt();
                    for (int i = 1; i <= N; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                case 3 -> {
                    System.out.print("Enter N: ");
                    int N = input.nextInt();
                    for (int i = 1; i <= N; i++) {
                        for (int j = 1; j <= N; j++) {
                            System.out.print(N + " ");
                        }
                        System.out.println();
                    }
                }
                case 4 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}
