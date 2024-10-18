class User {
    // Properties
    private int id;
    private String name;

    // Parameterized constructor
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}


public class Main {
    public static void main(String[] args)
    {
        // Create an object of Employee class
        Employee employee = new Employee(11, "Kush", 9400.00);

        // Calculate and display the annual salary
        double annualSalary = employee.calculateAnnualSalary();
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.printf("Monthly Salary: ₹%.2f%n", employee.getSalary());
        System.out.printf("Annual Salary: ₹%.2f%n", annualSalary);
    }
}