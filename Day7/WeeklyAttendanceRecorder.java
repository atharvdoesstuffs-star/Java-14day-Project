package Day7;

import java.util.Scanner;

public class WeeklyAttendanceRecorder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] attendance = new int[7];
        int presentDays = 0;
        int absentDays;
        double percentage;

        System.out.println("Enter Attendance for 7 Days (1 = Present, 0 = Absent):");

        for (int i = 0; i < attendance.length; i++) {

            attendance[i] = sc.nextInt();

            if (attendance[i] != 0 && attendance[i] != 1) {
                System.out.println("Invalid Input! Enter only 0 or 1.");
                sc.close();
                return;
            }
        }

        for (int i = 0; i < attendance.length; i++) {

            if (attendance[i] == 1)
                presentDays++;
        }

        absentDays = attendance.length - presentDays;
        percentage = (presentDays * 100.0) / attendance.length;

        System.out.println("\nWEEKLY ATTENDANCE REPORT ");
        System.out.println("Present Days : " + presentDays);
        System.out.println("Absent Days  : " + absentDays);
        System.out.printf("Attendance   : %.2f%%\n", percentage);

    }
}
