package Day14;

import java.util.Scanner;

class Employee {

    int empId;
    String name;
    double basicSalary;

    void getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }

    void displayEmployee() {
        System.out.println("\n===== EMPLOYEE DETAILS =====");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.printf("Basic Salary  : Rs. %.2f%n", basicSalary);
    }
}

class Manager extends Employee {

    double bonus;

    void getBonus() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
    }

    double calculateSalary() {
        return basicSalary + bonus;
    }

    void displayManager() {
        displayEmployee();
        System.out.printf("Bonus         : Rs. %.2f%n", bonus);
        System.out.printf("Total Salary  : Rs. %.2f%n", calculateSalary());
    }
}

public class EmployeeInheritance {

    public static void main(String[] args) {

        Manager manager = new Manager();

        manager.getEmployeeDetails();
        manager.getBonus();

        manager.displayManager();
    }
}
