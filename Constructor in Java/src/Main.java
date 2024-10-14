class Employee{
    int id;
    String name;


    // Constructor Overloading Example
    public Employee(){           // Constructor
        id = 10;
        name = "Kush Kumar Singh";
    }

    public Employee(String n){           // Constructor
        id = 20;
        name = n;
    }

    public Employee(int Id, String Naam){           // Constructor
        id = Id;
        name = Naam;
    }

    public void printDetails(){
        System.out.println("Id is :"+id);
        System.out.println("My name is :"+name);

    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();   // Constructor Called Automatically whenever the object is created.
        Employee e2 = new Employee("Shubham");
        Employee e3 = new Employee(30,"Zeeshan");


//        e1.id = 20;   // No need to create this again and again for the different object instead we create constructor
//        e1.name = "Vishal";

// Constructor do not have any return type always remember that.
        e1.printDetails();
        e2.printDetails();
        e3.printDetails();

    }
}