class Employee extends User {
    // Additional property
    private double salary; // Monthly salary

    // Parameterized constructor
    public Employee(int id, String name, double salary) {
        super(id, name); // Call to the superclass (User) constructor
        this.salary = salary;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12; // Annual salary is monthly salary * 12
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }
}
