package Day4;

import java.util.Scanner;

public class UniversityParkingFeeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String vehicleNumber;
        int parkingHours;
        double hourlyRate;
        double totalFee;

        System.out.print("Vehicle Number: ");
        vehicleNumber = sc.nextLine();

        System.out.print("Parking Hours: ");
        parkingHours = sc.nextInt();



        totalFee = parkingHours *12.5;

        System.out.println("\nPARKING FEE");
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Parking Hours  : " + parkingHours);

        System.out.printf("Total Fee      : %.2f\n", totalFee);

    }
}
