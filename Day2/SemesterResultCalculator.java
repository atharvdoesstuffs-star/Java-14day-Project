package Day2;

import java.util.Scanner;

public class SemesterResultCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sub1, sub2, sub3, sub4, sub5;
        int total;
        double percentage;

        System.out.print("Enter marks in five subjects: ");
        sub1 = sc.nextInt();
        sub2 = sc.nextInt();
        sub3 = sc.nextInt();
        sub4 = sc.nextInt();
        sub5 = sc.nextInt();

        total = sub1 + sub2 + sub3 + sub4 + sub5;
        percentage = total / 5.0;

        System.out.println("SEMESTER RESULT");
        System.out.println("Total Marks: " + total + " / 500");
        System.out.printf("Percentage: %.2f%%\n", percentage);

        if (percentage >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}
