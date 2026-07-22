package Day3;

import java.util.Scanner;

public class TrainingFeedbackSummary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    
        String studentName;
        int contentRating, explanationRating, practicalRating;
        int totalRating;
        double averageRating;
        System.out.print("Content rating: ");
        contentRating = sc.nextInt();

        System.out.print("Explanation rating: ");
        explanationRating = sc.nextInt();

        System.out.print("Practical rating: ");
        practicalRating = sc.nextInt();


        totalRating = contentRating + explanationRating + practicalRating;
        averageRating = totalRating / 3.0;

        System.out.println("\nTRAINING FEEDBACK");
        System.out.println("Content: " + contentRating + "/5");
        System.out.println("Explanation: " + explanationRating + "/5");
        System.out.println("Practical Work: " + practicalRating + "/5");
        System.out.printf("Average Rating: %.2f/5", averageRating);

    }
}
