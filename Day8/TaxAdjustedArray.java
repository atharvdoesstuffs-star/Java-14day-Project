package Day8;

import java.util.Scanner;

public class TaxAdjustedArray {

    public static double[] addTax(double[] prices, double taxRate) {
        double[] newPrices = new double[prices.length];

        for (int i = 0; i < prices.length; i++) {
            newPrices[i] = prices[i] + (prices[i] * taxRate / 100);
        }

        return newPrices;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        double[] prices = new double[n];

        System.out.println("Enter item prices:");

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();

            while (prices[i] < 0) {
                System.out.print("Invalid! Enter price again: ");
                prices[i] = sc.nextDouble();
            }
        }

        System.out.print("Enter GST Percentage: ");
        double gst = sc.nextDouble();

        double[] gstPrices = addTax(prices, gst);


        System.out.print("Original Prices:");
        for (double price : prices) {
            System.out.printf("%.2f ", price);
        }

        System.out.print("\nGST Adjusted Prices:");
        for (double price : gstPrices) {
            System.out.printf("%.2f ", price);
        }
    }
}
