package Day8;
import java.util.Scanner;

public class MonthlySalesPerformance {

    static Scanner sc = new Scanner(System.in);

    public static void readSales(double[] sales) {
        System.out.println("Enter sales for 12 months :");

        for (int i = 0; i < sales.length; i++) {
            sales[i] = sc.nextDouble();

            while (sales[i] < 0) {
                System.out.print("Invalid! Enter sales again: ");
                sales[i] = sc.nextDouble();
            }
        }
    }

    public static double calculateTotal(double[] sales) {
        double total = 0;

        for (double value : sales) {
            total += value;
        }

        return total;
    }

    public static double calculateAverage(double[] sales) {
        return calculateTotal(sales) / sales.length;
    }

    public static int countTargetMonths(double[] sales, double target) {
        int count = 0;

        for (double value : sales) {
            if (value >= target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        double[] sales = new double[12];

        readSales(sales);

        System.out.print("Enter Target Sales: ");
        double target = sc.nextDouble();

        double total = calculateTotal(sales);
        double average = calculateAverage(sales);
        int achieved = countTargetMonths(sales, target);

        System.out.println("\nSALES PERFORMANCE");
        System.out.printf("Annual Sales: Rs. %.2f\n", total);
        System.out.printf("Average Monthly Sales: Rs. %.2f\n", average);
        System.out.println("Months Achieving Target: " + achieved);
    }
}
