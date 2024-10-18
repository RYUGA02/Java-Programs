class VaccinationSuccessful extends Vaccine {

    // Constructor to initialize age and nationality
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    public void boosterDose() {
        System.out.println("You are eligible for the booster dose.");
    }
}