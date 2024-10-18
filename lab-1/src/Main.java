import java.util.Scanner;   // importing the Scanner class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Ask the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Using the ternary operator to find the maximum number
        double max = (num1 > num2) ? num1 : num2;

        // Display the maximum number
        System.out.println("The maximum number is: " + max);

    }
}