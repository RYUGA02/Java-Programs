class Phone{
    public void greet(){
        System.out.println("Good Night");
    }

    public void name(){
        System.out.println("My name is Kush Kumar Singh.");
    }
}

class SmartPhone extends Phone{
    public void swagat(){
        System.out.println("swagat nahi karoge hamara.");
    }
    @Override
    public void name(){
        System.out.println("My name is Shubham Sahu.");
    }
}

public class Main {
    public static void main(String[] args) {

        Phone nokia = new SmartPhone(); // Dynamic Method Dispatch
        nokia.greet(); // allowed
        nokia.name();  // will execute the method of the SmartPhone class because the object is created from SmartPhone
//        nokia.swagat(); // Not allowed as we cannot access the method of subclass in the Dynamic Method Dispatch. But we can access the all the methods of the superclass.

    }
}