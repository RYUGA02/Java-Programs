public class Method_Overloading {

    int add(int a , int b){
        return a+b;
    }

    double add(double a , double b){
        return a+b;
    }

    String add(String a, String b){
        return a.concat(b);
    }

    public static void main(String[] args) {

        Method_Overloading obj = new Method_Overloading();

        System.out.println(  obj.add(10,20));
        System.out.println(  obj.add(12.232,12132.3243));
        System.out.println( obj.add("Kush", " Kumar Singh"));
    }
}
