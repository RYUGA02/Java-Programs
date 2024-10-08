import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        //1) Write a program to keep asking for a number until you enter a negative number. At the end, print the sum of all entered numbers.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number :");
//        byte num = sc.nextByte();
//        byte sum = num;
//
//           if(num>0) {
//               int num2 =sum;
//               System.out.println("Printing the value "+num2);
////               System.out.println("Enter the number :");
////               num2 = sc.nextInt();
//               while (num2 > 0) {
//
//                   System.out.println("Enter the number : ");
//                    num2 = sc.nextInt();
//                   sum += num2;
//               }
//
//           }
//           else{
//               System.out.println("Your Result is " +num);
//               }
//
//
//        System.out.println("Your Total score is :"+sum);


//        2) Write a program to ask for a name until the user enters END. Print the name each time. When you are done, print "I am done."

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your Name:");
//        while (true) {
//            System.out.print("Please enter your name (or 'END' to quit): ");
//            String name = scanner.nextLine().trim().toUpperCase();
//            if (name.equals("END")) {
//                break;
//            }
//            System.out.println("Hello, " + name + "!");
//        }
//        System.out.println("I am done.");
//        scanner.close();


//     Do-While Loop

//
//        int i =0;
//       do{
//           System.out.println(i);
//           i++;
//
//       }while(i<10);
        Random rand = new Random();
        int secretNumber = rand.nextInt(100) + 1; // Generate a secret number between 1 and 100
        int guess = 0; // Variable to store user guess
        int attempts = 0; // Variable to count the number of attempts

        Scanner scanner = new Scanner(System.in);

        // Start the do-while loop to allow user to guess the number
        do {
            System.out.print("Enter your guess (between 1 and 100): ");
            guess = scanner.nextInt(); // Read user input
            attempts++; // Increment the attempt count

            // Provide feedback on the guess
            if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number!");
            }
        } while (guess != secretNumber); // Repeat until the guess is correct

        // Display the number of attempts
        System.out.println("You guessed the number in " + attempts + " attempts.");


    }
}