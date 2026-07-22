package Day10;

import java.util.Scanner;

public class CollegeEmailValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = sc.nextLine().trim();

        System.out.print("Enter Required Domain (Example: @chitkara.edu.in): ");
        String domain = sc.nextLine().trim();

        int firstAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');

        boolean valid = true;

  
        if (firstAt <= 0) {
            valid = false;
        }

        if (firstAt != lastAt) {
            valid = false;
        }

        if (!email.endsWith(domain)) {
            valid = false;
        }

        System.out.println("\nEMAIL VALIDATION ");
        System.out.println("Email : " + email);

        if (valid) {
            System.out.println("Status : Valid College Email");
        } else {
            System.out.println("Status : Invalid College Email");
        }

        sc.close();
    }
}
