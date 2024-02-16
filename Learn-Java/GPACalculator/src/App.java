import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Integer credits = 0;
        boolean validCredits = false;
        do {
            System.out.println("Please enter number of credits:");
            String creditsString = scanner.nextLine();

            try {
                credits = Integer.parseInt(creditsString);
                validCredits = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a valid integer for number of credits:");
            }
        } while (validCredits == false);

        System.out.println("Please enter your grade:");
        String grade = scanner.nextLine();

        Integer gradeValue = 0;
        if (grade.equalsIgnoreCase("A")) {
            gradeValue = 4;
        } else if (grade.equalsIgnoreCase("B")) {
            gradeValue = 3;
        } else if (grade.equalsIgnoreCase("C")) {
            gradeValue = 2;
        } else if (grade.equalsIgnoreCase("D")) {
            gradeValue = 1;
        } else if (grade.equalsIgnoreCase("F")) {
            gradeValue = 0;
        } else {
            System.out.println("You didn't enter a valid grade :(");
        }

        Integer points = gradeValue * credits;

        Integer gpa = points / credits;

        System.out.println("Credits: " + credits);
        System.out.println("Grade: " + grade);
        System.out.println("Points: " + points);
        System.out.println("GPA: " + gpa);

        scanner.close();

    }
}
