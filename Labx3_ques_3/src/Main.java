// Abstract class Vaccine
abstract class Vaccine {
    //Instance Variables
    protected int age;
    protected String nationality;

    // Constructor to initialize variables
    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    //  method for the first dose
    public void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("You are eligible for the first dose.");
            System.out.println("You have to pay 2080 Rs for the first dose.");
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }

    //  method for the second dose
    public void secondDose(boolean firstDoseCompleted) {
        if (firstDoseCompleted) {
            System.out.println("You are eligible for the second dose.");
        } else {
            System.out.println("You must complete the first dose before taking the second dose.");
        }
    }

    // Abstract method for booster dose
    public abstract void boosterDose();
}

public class Main {
    public static void main(String[] args) {

        int userAge = 20;
        String userNationality = "Indian";

        // Creates an instance of the VaccinationSuccessful class
        VaccinationSuccessful user = new VaccinationSuccessful(userAge, userNationality);

        // Check first dose eligibility
        user.firstDose();

        // Assuming the user completes the first dose
        boolean firstDoseCompleted = true;

        // Check second dose eligibility
        user.secondDose(firstDoseCompleted);

        // Check eligibility for booster dose
        user.boosterDose();
    }
}