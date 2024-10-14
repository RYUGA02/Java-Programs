class Rectangle{
    int length;
    int breadth;

    public int area(){
        return length*breadth;
    }

    public int perimeter(){
        return 2*(length*breadth);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating the instance of class
        Rectangle k = new Rectangle();

        k.length = 20;
        k.breadth = 30;



        System.out.println(k.area());
        System.out.println(k.perimeter());
    }
}