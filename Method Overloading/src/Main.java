public class Main {

    static void myName(){
        System.out.println("My name is Kush Kumar Singh");
    }

    static void myName(String name){
        System.out.println("My name is "+name);
    }

//    static int myName(){
//        System.out.println("HEllo");
//        return 10;
//    }

    static void myName(String name, String name2){
        System.out.println("My name is "+name +" . My name is also " +name2);
    }

    public static void main(String[] args) {

        // Method Overloading in java

        myName();
        myName("Harry");
        myName("vikash","Vikky");
        // we cannot change the return type of the static method

    }
}