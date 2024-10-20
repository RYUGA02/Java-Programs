// Constructor in Inheritance.

class Base{
    Base(){             // Constructor
        System.out.println("This is the Base class Constructor without Parameter.");
    }
    Base(int x){
        System.out.println("I am overloaded Base Constructor with value : "+x);
    }
}

class Derived extends Base{
    Derived(){
        System.out.println("This is the Derived class Contructor without Parameter.");
    }

//    Derived(int x, int y){
//        System.out.println("I am overloaded Derived Constructor with value :"+y);
//    }

    Derived(int x, int y){
        super(x);
       System.out.println("I am overloaded Derived Constructor with value :"+y);
    }
}

class childOfDerived extends Derived{
    childOfDerived(){
        System.out.println("This is the childOfDerived class without Parameter.");
    }
//    childOfDerived(int x, int y, int z){
//        System.out.println("I am an overloaded childOfDerived class with Parameter.");
//    }
    childOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloaded childOfDerived class with value :"+z);
    }
}

public class Main {
    public static void main(String[] args) {

//        Base b = new Base(); // Prints the Base class Constructor without the parameter or default parameter.
//        Derived d = new Derived(); // Prints the Base class default constructor and then Derived class default Constructor.
//        Derived d1 = new Derived(10,20); // Prints the Base class default constructor and then the Derived parameterised Constructor.
//        Derived d2 = new Derived(100,200); // Prints the Base class parameterized constructor and then the Derived class Parameterized Constructor.
//        childOfDerived cd = new childOfDerived(); // Prints the Base class default constructor then derived class default constructor and then childOfDerived class default constructor.
          childOfDerived cd1 = new childOfDerived(500,1000,2000);
    }
}