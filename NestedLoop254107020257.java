import java.util.Scanner;

public class NestedLoop254107020257 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array for storing temperature data
        double[][] temps = new double[5][7]; // 5 rows (weeks), 7 columns (days)

        // Input temperature data
        System.out.println("Enter temperature data for 5 weeks (7 days each):");
        for (int week = 0; week < 5; week++) {
            System.out.println("Week " + (week + 1) + ":");
            for (int day = 0; day < 7; day++) {
                System.out.print("  Day " + (day + 1) + " temperature: ");
                temps[week][day] = scanner.nextDouble();
            }
            System.out.println();
        }

        // Display all temperature data
        System.out.println("\nTemperature Data:");
        for (int week = 0; week < 5; week++) {
            System.out.print("Week " + (week + 1) + ": ");
            for (int day = 0; day < 7; day++) {
                System.out.print(temps[week][day] + " ");
            }
            System.out.println();
        }

        // Calculate average temperature for each week
        System.out.println("\nAverage Temperature per Week:");
        for (int week = 0; week < 5; week++) {
            double total = 0;
            for (int day = 0; day < 7; day++) {
                total += temps[week][day];
            }
            double average = total / 7;
            System.out.println("Week " + (week + 1) + ": " + average);
        }

        scanner.close();
    }
}
