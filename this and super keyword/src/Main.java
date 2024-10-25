class A {
    public int a;
    public int b = 100;
    public void setValue(int v){
        this.a = v;
    }

    public int getValue(){
        return a;
    }
}

class B extends A{
    public void details(){
        System.out.println("Hello world");
        System.out.println("The value i am getting by inheriting the variable from superclass is :"+super.b);
    }
}

public class Main {
    public static void main(String[] args) {

//        this refers to the current object; Used to access instance variables and methods of the current class
//        super refers to the superclass object;.Used to access superclass methods and variables.

        A a1 = new A();
        B b1 = new B();

        a1.setValue(10);
        System.out.println("The setted value is :"+a1.getValue());
        b1.details();


    }
}