package Day2;
import java.util.Scanner;
public class EmployeeSalarySlip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double basicSalary, hra, da, pf, grossSalary, netSalary;

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();

        hra = basicSalary * 20 / 100;
        da = basicSalary * 10 / 100;
        pf = basicSalary * 12 / 100;

        grossSalary = basicSalary + hra + da;
        netSalary = grossSalary - pf;

        System.out.println("SALARY SLIP");
        System.out.printf("Basic Salary: Rs.%.2f\n", basicSalary);
        System.out.printf("HRA (20%%): Rs.%.2f\n", hra);
        System.out.printf("DA (10%%): Rs.%.2f\n", da);
        System.out.printf("PF (12%%): Rs.%.2f\n", pf);
        System.out.printf("Gross Salary: Rs.%.2f\n", grossSalary);
        System.out.printf("Net Salary: Rs.%.2f\n", netSalary);

    }
}
