package Day7;

import java.util.Scanner;

public class FiveSubjectMarksDashboard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;
        int passed = 0;
        int failed = 0;
        double average;

        System.out.println("Enter Marks:");

        for (int i = 0; i < marks.length; i++) {

            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid Marks! Marks should be between 0 and 100.");
                sc.close();
                return;
            }
        }

        for (int i = 0; i < marks.length; i++) {

            total += marks[i];

            if (marks[i] >= 40)
                passed++;
            else
                failed++;
        }

        average = (double) total / marks.length;


        System.out.println("\nMARKS DASHBOARD");
        System.out.println("Total Marks      : " + total);
        System.out.printf("Average Marks    : %.2f%n", average);
        System.out.println("Passed Subjects  : " + passed);
        System.out.println("Failed Subjects  : " + failed);

    }
}
