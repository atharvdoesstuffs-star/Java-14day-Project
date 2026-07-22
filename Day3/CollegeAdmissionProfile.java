package Day3;

import java.util.Scanner;

public class CollegeAdmissionProfile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name, programme, semester, email, city;
        int rollNumber;

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Programme: ");
        programme = sc.nextLine();

        System.out.print("Enter Semester: ");
        semester = sc.nextLine();

        System.out.print("Enter Email: ");
        email = sc.nextLine();

        System.out.print("Enter City: ");
        city = sc.nextLine();

        System.out.println("\nADMISSION PROFILE");
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + rollNumber);
        System.out.println("Programme : " + programme);
        System.out.println("Semester : " + semester);
        System.out.println("Email : " + email);
        System.out.println("City: " + city);

    }
}
