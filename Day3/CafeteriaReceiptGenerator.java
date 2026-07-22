package Day3;

import java.util.Scanner;

public class CafeteriaReceiptGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String itemName;
        double unitPrice, gstRate, gstAmount, totalAmount;
        int quantity;

        System.out.print("Enter Item Name: ");
        itemName = sc.nextLine();

        System.out.print("Enter Unit Price: ");
        unitPrice = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();

        System.out.print("Enter GST Rate (%): ");
        gstRate = sc.nextDouble();

        double subTotal = unitPrice * quantity;
        gstAmount = subTotal * gstRate / 100;
        totalAmount = subTotal + gstAmount;

        System.out.println("\nCAFETERIA RECEIPT");
        System.out.println("Item Name   : " + itemName);
        System.out.printf("Subtotal    : Rs. %.2f%n", subTotal);
        System.out.printf("GST (%.0f%%) : Rs. %.2f%n", gstRate, gstAmount);
        System.out.printf("Total Bill  : Rs. %.2f%n", totalAmount);

        sc.close();
    }
}
