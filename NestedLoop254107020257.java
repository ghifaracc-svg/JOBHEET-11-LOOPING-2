import java.util.Scanner;

public class NestedLoop254107020257 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(new java.util.Locale("id", "ID"));



        // === Step 1: Declare 2D array ===
        // 5 cities, each with 7 days of temperature data
        double[][] temps = new double[5][7];

        for (int city = 0; city < 5; city++) {
            System.out.println("City " + (city + 1) + ":");
            for (int day = 0; day < 7; day++) {
                System.out.print("  Day " + (day + 1) + " temperature: ");
                temps[city][day] = scanner.nextDouble();
            }
            System.out.println();
        }

        // === Step 3: Display all temperature data (using for-each) ===
        System.out.println("\nTemperature Data for Each City:");
        int cityNumber = 1;
        for (double[] cityTemps : temps) {
            System.out.print("City " + cityNumber + ": ");
            for (double temp : cityTemps) {
                System.out.print(temp + " ");
            }
            System.out.println();
            cityNumber++;
        }

        // === Step 4: Calculate and display average temperature per city ===
        System.out.println("\nAverage Temperature per City:");
        for (int city = 0; city < temps.length; city++) {
            double total = 0;
            for (double temp : temps[city]) {
                total += temp;
            }
            double average = total / temps[city].length;
            System.out.println("City " + (city + 1) + ": " + average);
        }

        scanner.close();
    }
}
