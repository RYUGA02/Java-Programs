class Employee {

    // Attributes or properties
    String name;
    int classs;
    long roll_no;
    String Subject;
    String Salary;
    String Company_name;

    // Methods or behaviour
    public void getSalary() {
        System.out.println("Salary is :" + Salary);
    }


    public void getDetails() {
        System.out.println("My Name is :" + name);
        System.out.println("My class is:" + classs);
        System.out.println("My roll-no. is:" + roll_no);
        System.out.println("My Company Name is :" + Company_name);
    }
}

    public class Main {

    public static void main(String[] args) {

        // Creating the instance of Class Or Simply an Object
        Employee kush = new Employee();
        Employee shubham = new Employee();

        // Setting The Attributes for Kush
        kush.name = "Kush Kumar Singh";
        kush.classs = 11;
        kush.roll_no = 17;
        kush.Company_name = "Amazon.com";
        kush.Salary = "1.5 lakhs";

        //Setting The Attributes for Shubham
        shubham.name = "Shubham Sahu";
        shubham.classs = 11;
        shubham.roll_no = 18;
        shubham.Company_name = "Google.com";
        shubham.Salary = "9.5 lakhs";



        // Getting The Methods
        kush.getSalary();
        shubham.getSalary();

        // Printing The Details of The Employee
        kush.getDetails();
        shubham.getDetails();
    }
}