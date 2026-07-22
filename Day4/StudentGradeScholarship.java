package Day4;

import java.util.Scanner;

public class StudentGradeScholarship {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double percentage, attendance;
        String grade, scholarship;

        System.out.print("Percentage: ");
        percentage = sc.nextDouble();

        System.out.print("Attendance: ");
        attendance = sc.nextDouble();

        if (percentage < 0 || percentage > 100 || attendance < 0 || attendance > 100) {

            System.out.println("\nACADEMIC DECISION");
            System.out.println("Validation: Invalid Input");

        } else {

            if (percentage >= 85) {
                grade = "A";
            } else if (percentage >= 75) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 40) {
                grade = "D";
            } else {
                grade = "F";
            }

            if (percentage >= 85 && attendance >= 90) {
                scholarship = "Eligible";
            } else {
                scholarship = "Not Eligible";
            }

            System.out.println("\nACADEMIC DECISION");
            System.out.println("Grade: " + grade);
            System.out.println("Scholarship: " + scholarship);
            System.out.println("Validation: Input accepted");
        }

    }
}
