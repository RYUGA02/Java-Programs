import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Prompt the user to enter the bit position to check
        System.out.print("Enter the bit position (n): ");
        int n = scanner.nextInt();

        // Check if the nth bit is set (1) or not (0)
        boolean isBitSet = (num & (1 << n)) != 0;

        // Display the result
        if (isBitSet) {
            System.out.println("The " + n + "th bit of " + num + " is set (1).");
        } else {
            System.out.println("The " + n + "th bit of " + num + " is not set (0).");
        }
    }
}