class User{
    int id;
    String name;


    public User(){
        this.id = 12;
        this.name = "Kush Kumar Singh";
    }

    // Declaring the parameterized constructor
    public User(int id1 , String name1){
        this.id = id1;
        this.name = name1;
    }

    public void printDetails(){
        System.out.println("The id of Employee is "+id);
        System.out.println("The name of Employee is "+name);
    }
}

// Subclass or extended class or derived class
class Employee extends User{
    double Salary;

    public void setSalary(int s){
        this.Salary = s;
    }


    public double calculateAnnualSalary(){
        return   Salary * 12;
    }
}



public class Main {
    public static void main(String[] args) {

//
//     Create a program to calculate the annual salary of an employee by using inheritance.
//     Create a class named "User" with the following properties and methods:
//     Properties: id(int): representing the id of the User name(String):representing the name of the User Constructor
//     : Declare parameterized constructor to initialize id and name.
//     Create a subclass named "Employee" that inherits from the "User" class.
//     Add the following additional properties and methods: Properties:
//     salary(double):representing the monthly salary of the employee Method:
//     double calculateAnnualSalary():to calculate the annual salary earned by the employee.
//     In the main method, create an object of "Employee" class. Calculate the annual salary of the employee and display it..
//     [Hint:Use constructor or setter methods to set the value]


        Employee e1 = new Employee();
        e1.setSalary(5000);
        e1.printDetails();
        System.out.println("The salary of the Employee is "+ e1.calculateAnnualSalary());

    }
}