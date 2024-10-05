public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        // Operator Precedence
        int a= 10;
        int b= 20;
        int k = a*b-b/a+b+a;
        System.out.println(k);


        // Associativity
        int m = 40;
        int c= 20;
        int l= 30;
        int r= m*m - (4*m*l)/(2*l);
        System.out.println(r);
    }

}