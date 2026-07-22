package Day12;
import java.util.Scanner;

class Enrollment {

    String enrollmentId;
    String learnerName;
    String courseName;
    double fee;
    String paymentStatus;

    Enrollment(String enrollmentId, String learnerName,
               String courseName, double fee, String paymentStatus) {

        this.enrollmentId = enrollmentId;
        this.learnerName = learnerName;
        this.courseName = courseName;
        this.fee = fee;
        this.paymentStatus = paymentStatus;
    }

    Enrollment(String enrollmentId, String learnerName,
               String courseName, double fee) {

        this(enrollmentId, learnerName, courseName, fee, "Pending");
    }

    void display() {

        System.out.println("\n ENROLLMENT RECORD ");
        System.out.println("Enrollment ID : " + enrollmentId);
        System.out.println("Learner Name  : " + learnerName);
        System.out.println("Course Name   : " + courseName);
        System.out.printf("Course Fee    : Rs. %.2f%n", fee);
        System.out.println("Payment Status: " + paymentStatus);
    }
}

public class CourseEnrollmentRecord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Enrollment ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Learner Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        System.out.print("Enter Course Fee: ");
        double fee = sc.nextDouble();
      
        Enrollment e1 = new Enrollment(id, name, course, fee);

        Enrollment e2 = new Enrollment(
                "E102",
                "Rahul",
                "Core Java",
                15000,
                "Paid"
        );

        e1.display();
        e2.display();

        sc.close();
    }
}
