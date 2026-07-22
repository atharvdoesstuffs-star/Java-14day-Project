package Day10;

import java.util.Scanner;

public class StudentNameFormatter {


    public static String capitalize(String name) {

        name = name.trim().toLowerCase();

        if (name.length() == 0) {
            return "";
        }

        return Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String first = sc.nextLine();

        System.out.print("Enter Middle Name: ");
        String middle = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String last = sc.nextLine();

        first = capitalize(first);
        middle = capitalize(middle);
        last = capitalize(last);

        String fullName = first + " " + middle + " " + last;

        String initials = Character.toUpperCase(first.charAt(0))
                + ". "
                + Character.toUpperCase(middle.charAt(0))
                + ". "
                + last;

        System.out.println("\nSTUDENT NAME FORMATTER ");
        System.out.println("Formatted Name : " + fullName);
        System.out.println("Initial Format : " + initials);

        sc.close();
    }
}
