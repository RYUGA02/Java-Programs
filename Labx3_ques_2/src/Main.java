import java.util.Scanner;

// Superclass Animal
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}


 public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an animal to create (dog/cat): ");
        String choice = scanner.nextLine().toLowerCase();

        Animal animal;

        // Creating an object based on user input
        if (choice.equals("dog")) {
            animal = new Dog(); // Create Dog object
        } else if (choice.equals("cat")) {
            animal = new Cat(); // Create Cat object
        } else {
            System.out.println("Invalid choice. Creating a generic Animal.");
            animal = new Animal(); // Create generic Animal object
        }

        // Displaying the sound of the selected animal
        animal.makeSound(); // Calling the overridden method
    }
}