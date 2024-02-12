import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

    private static final int INCHES_IN_A_FOOT = 12;

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your weight in pounds:");
        double weight = scanner.nextDouble();

        System.out.println("Please enter your height in feet:");
        int heightFeet = scanner.nextInt();

        System.out.println("Please enter your height remaining in inches:");
        int heightInch = scanner.nextInt();

        scanner.close();

        int totalHeightInInches = (heightFeet * INCHES_IN_A_FOOT) + heightInch;

        double bmi = weight / Math.pow(totalHeightInInches, 2) * 703;

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Your BMI is: " + df.format(bmi));

    }
}
