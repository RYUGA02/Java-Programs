import java.util.Scanner;

public class Main {

    // Function to calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {                  // for 0 or 1 factorial is always 1.
            return 1;
        }
        int result = 1;                            // ------ In Loop -------------(for number = 5)
        for (int i = 2; i <= n; i++) {            //  result = result * 2;  --> result =1*2 ==2
            result *= i;                          // result = result * 3 ;  --> 2*3 == 6
        }                                         // result = result * 4 ;  --> 6*4 ==24
        return result;                            // result = result * 5 ; --> 24*5 == 120
    }

    // Function to check if a number is a strong number
    public static boolean isStrongNumber(int num) {                        // suppose you have given 145 to check whether it is strong Number or not.
        int originalNum = num;                            // originalNum = 145;
        int sumOfFactorials = 0;

        // Calculate the sum of the factorials of the digits
        while (num > 0) {                                                // while(145>0)
            int digit = num % 10;                                        // digit = 145 % 10 == 5
            sumOfFactorials += factorial(digit);                         // sumOfFactorials = sumOfFactorials + factorial(5); == 0 + 120 == 120
            num /= 10; // Remove the last digit                          // num = 145 / 10 == 14
                                                                         // Now it agains check the while loop is(14>0) and again goes to loop and does the same process unntil condition fails.
        }

        // Check if the sum of factorials is equal to the original number
        return sumOfFactorials == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a strong number
        if (isStrongNumber(number)) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }

        scanner.close();
    }
}
