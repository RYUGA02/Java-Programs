import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        // Taking input from user involves importing the Scanner class by using import java.util.Scanner
        Scanner sc = new Scanner(System.in);

        // Taking int as an input from the user then use nextInt() property.
        int a = sc.nextInt();
        System.out.println(a);

        // Taking Float as an input from the user then use nextFloat() property.
        float f = sc.nextFloat();
        System.out.println(f);

        // Taking String as an input from the user then use next() property.
        String str = sc.next();
        System.out.println(str);

        // Taking String full line as an input from the user then use nextLine() property.
        String str2 = sc.nextLine();
        System.out.println(str2);

    }
}