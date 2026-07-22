package Day8;
import java.util.Scanner;

public class ClassAttendanceAnalysis {

    static Scanner sc = new Scanner(System.in);

    public static void readAttendance(double[] attendance) {
        System.out.println("Enter attendance :");

        for (int i = 0; i < attendance.length; i++) {
            attendance[i] = sc.nextDouble();

            while (attendance[i] < 0 || attendance[i] > 100) {
                System.out.print("Invalid attendance! Enter again: ");
                attendance[i] = sc.nextDouble();
            }
        }
    }

    public static double calculateAverage(double[] attendance) {
        double sum = 0;

        for (double value : attendance) {
            sum += value;
        }

        return sum / attendance.length;
    }

    public static int countShortage(double[] attendance, double limit) {
        int count = 0;

        for (double value : attendance) {
            if (value < limit) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] attendance = new double[n];

        readAttendance(attendance);

        double average = calculateAverage(attendance);
        int shortage = countShortage(attendance, 75);

        System.out.println("\nCLASS ATTENDANCE");
        System.out.printf("Class Average: %.2f%%\n", average);
        System.out.println("Students Below 75%: " + shortage);
    }
}
