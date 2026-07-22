package Day7;

import java.util.Scanner;

public class DailyExpenseTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] expenses = new double[7];
        double total = 0;
        double average;
        double budget;
        int aboveBudget = 0;

        System.out.println("===== DAILY EXPENSE TRACKER =====");

        System.out.println("Enter Expenses for 7 Days:");

        for (int i = 0; i < expenses.length; i++) {

            expenses[i] = sc.nextDouble();

            if (expenses[i] < 0) {
                System.out.println("Invalid Expense! Expense cannot be negative.");
                sc.close();
                return;
            }
        }

        System.out.print("Enter Daily Budget Limit: ");
        budget = sc.nextDouble();

        if (budget < 0) {
            System.out.println("Invalid Budget!");
            sc.close();
            return;
        }

        for (int i = 0; i < expenses.length; i++) {

            total += expenses[i];

            if (expenses[i] > budget) {
                aboveBudget++;
            }
        }

        average = total / expenses.length;


        System.out.println("\nEXPENSE REPORT");
        System.out.printf("Total Spending          : Rs. %.2f%n", total);
        System.out.printf("Average Daily Spending  : Rs. %.2f%n", average);
        System.out.println("Days Above Budget       : " + aboveBudget);


    }
}
