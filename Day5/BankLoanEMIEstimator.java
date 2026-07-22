package Day5;

import java.util.Scanner;

public class BankLoanEMIEstimator {

    public static double calculateInterest(double principal, double rate, double years) {
        return (principal * rate * years) / 100;
    }

    public static double calculateTotalPayable(double principal, double interest) {
        return principal + interest;
    }

    public static double calculateMonthlyInstallment(double totalPayable, int months) {
        return totalPayable / months;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== BANK LOAN EMI ESTIMATOR =====");

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Loan Period (Years): ");
        double years = sc.nextDouble();

        System.out.print("Enter Number of Months: ");
        int months = sc.nextInt();

        if (principal <= 0 || rate < 0 || years <= 0 || months <= 0) {
            System.out.println("Invalid Input!");
            return;
        }

        double interest = calculateInterest(principal, rate, years);
        double totalPayable = calculateTotalPayable(principal, interest);
        double emi = calculateMonthlyInstallment(totalPayable, months);

        System.out.println("\nLOAN ESTIMATE");
        System.out.printf("Simple Interest       : Rs. %.2f\n", interest);
        System.out.printf("Total Payable Amount  : Rs. %.2f\n", totalPayable);
        System.out.printf("Monthly Installment   : Rs. %.2f\n", emi);

    }
}
