package Day6;

import java.util.Scanner;

public class CourierChargeCalculator {

    // Method for Local Delivery
    public static double calculateCharge(double weight) {
        return 50 + (weight * 20);
    }

    // Overloaded Method for Outstation Delivery
    public static double calculateCharge(double weight, double distance) {
        return 100 + (weight * 25) + (distance * 0.9);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== COURIER CHARGE CALCULATOR =====");
        System.out.println("1. Local Delivery");
        System.out.println("2. Outstation Delivery");

        System.out.print("Enter Delivery Type: ");
        int choice = sc.nextInt();

        System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();

        if (weight <= 0) {
            System.out.println("Invalid Weight!");
            return;
        }

        double charge;

        switch (choice) {

            case 1:
                charge = calculateCharge(weight);

                System.out.println("\nCOURIER CHARGE");
                System.out.println("Delivery Type : Local");
                System.out.println("Weight        : " + weight + " kg");
                System.out.printf("Charge        : Rs. %.2f\n", charge);
                break;

            case 2:
                System.out.print("Enter Distance (km): ");
                double distance = sc.nextDouble();

                if (distance <= 0) {
                    System.out.println("Invalid Distance!");
                    return;
                }

                charge = calculateCharge(weight, distance);

                System.out.println("\n===== COURIER CHARGE =====");
                System.out.println("Delivery Type : Outstation");
                System.out.println("Weight        : " + weight + " kg");
                System.out.println("Distance      : " + distance + " km");
                System.out.printf("Charge        : Rs. %.2f\n", charge);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

    }
}
