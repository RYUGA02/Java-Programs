class A{
    public void display(){
        System.out.println("I am displaying the status of java Training day-30");
    }

    public void name(){
        System.out.println("My naame is orashssae.");
    }
}
class B extends A{
    @Override
    public void display(){
        System.out.println("I am the method overriding in java class.");
    }

}
public class Main {
    public static void main(String[] args) {

//        Method Overriding == If a child class implements the same method present in the parent class again , it is known as method overriding.
//        Also known as Redefinig method of superclass.
//                Rules for method overriding -- 1. Return type same 2. same access modifier 3. cannot override static method 4. cannot override final method


        B b = new B();
        b.display();        // This is the method overidding in the java.
    }
}