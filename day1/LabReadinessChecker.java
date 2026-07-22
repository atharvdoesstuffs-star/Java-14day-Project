package day1;

import java.util.Scanner;

public class LabReadinessChecker {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Student Name: ");
            String studentName = sc.nextLine();

            System.out.print("Laboratory Name: ");
            String laboratoryName = sc.nextLine();

            System.out.println("JAVA LAB READINESS CHECK ");
            System.out.println("Student Name: " + studentName);
            System.out.println("Laboratory: " + laboratoryName);
            System.out.println("Status: Java environment is ready.");
            System.out.println("Compile Command: javac LabReadinessChecker.java");
            System.out.println("Run Command: java LabReadinessChecker");

        }
    }
