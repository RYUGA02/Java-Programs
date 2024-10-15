import java.util.Random;
import java.util.Scanner;

class Game {
    private int cpuRandomNumber; // The CPU's random number
    private int userInput;       // The user's guessed number
    public int attempts ;        // Number of attempts made by the user

    // Constructor to generate a random number between 1 and 100
    public Game() {
        Random rand = new Random();
        cpuRandomNumber = rand.nextInt(100) + 1; // Random number from 1 to 100
        attempts = 0; // Initialize attempts   --> it will be initialized only when the object is created
    }

    // Method to take user input  or  setter
    public void takeUserInput(int userInput) {
        this.userInput = userInput; // Store the user's guess
    }

    // Method to check if the guess is correct
    public boolean isCorrectNumber() {
        attempts++; // Increment attempts for each guess
        if (cpuRandomNumber > userInput) {
            System.out.println("Wrong guess! Too low.");
            return false; // Not correct
        } else if (cpuRandomNumber < userInput) {
            System.out.println("Wrong guess! Too high.");
            return false; // Not correct
        } else {
            System.out.println("Congratulations! Correct guess.");
            System.out.println("Total attempts: " + attempts);
            return true; // Correct guess
        }
    }

    // Getter for attempts   or getter
    public int getAttempts() {
        return attempts;
    }

    // Method to print the CPU's random number (optional)
    public void printCpuNumber() {
        System.out.println("CPU number is: " + cpuRandomNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        Game game = new Game(); // Create a new game instance
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        boolean guessedCorrectly = false; // Flag for tracking the correct guess

        // Loop until the user guesses correctly
        while (!guessedCorrectly) {
            // Prompt user for their guess
            System.out.print("Guess a number between 1 and 100: ");
            int userGuess = scanner.nextInt(); // Read user input
            game.takeUserInput(userGuess); // Store the user input

            // Check the guess
            guessedCorrectly = game.isCorrectNumber(); // Check if the guess is correct
        }

        // Optionally show the correct number after one attempt
        // game.printCpuNumber();

        scanner.close(); // Close the scanner
    }
}
