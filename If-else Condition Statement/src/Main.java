import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        // If-Else Statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Put the number to check whether the number is positive or negative");
        int name = sc.nextInt();
        if(name>=0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }

    }
}