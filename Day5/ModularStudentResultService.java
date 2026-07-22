package Day5;

import java.util.Scanner;

public class ModularStudentResultService {

    static int calculateTotal(int m1, int m2, int m3, int m4, int m5) {
        return m1 + m2 + m3 + m4 + m5;
    }

    static double calculatePercentage(int total, int maxMarks) {
        return (total * 100.0) / maxMarks;
    }

    static boolean isPassed(double percentage) {
        return percentage >= 40;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m1, m2, m3, m4, m5;
        int total;
        double percentage;

        System.out.print("Marks: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();

        total = calculateTotal(m1, m2, m3, m4, m5);
        percentage = calculatePercentage(total, 500);

        System.out.println("\nSTUDENT RESULT");
        System.out.println("Total: " + total);
        System.out.printf("Percentage: %.2f%%\n", percentage);

        if (isPassed(percentage)) {
            System.out.println("Status: PASS");
        } else {
            System.out.println("Status: FAIL");
        }

    }
}
