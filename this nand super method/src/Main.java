class A{

    public A(){
        System.out.println("I am the superclass Default Constructor.");
    }

    public A(int a){
        System.out.println("I am the superclass parameterized Constructor.");
    }
}

class B extends A{

    public B(){
//        super(10);
        System.out.println("I am the subclass Default Constructor.");
    }

    public B (int b){
//        super(b);
        this();
        System.out.println("I am the subclass Parameterized Constructor.");
    }
}

public class Main {
    public static void main(String[] args) {
//        this() is used to execute the constructor of the same class while super() is used to execute the constructor of the superclass in java.

        B b = new B(100); // if i want to access both default and parameterized constructor of the B class i can do it by using the this() method.
    }
}