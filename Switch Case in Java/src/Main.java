import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");

        // Switch Case
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number :");
       int num= sc.nextInt();
        switch(num){
            case 18:
                System.out.println("You are going to become adult now!");
                break;
            case 35:
                System.out.println("You are going to get Married.");
                break;
            case 40:
                System.out.println("You are going to become a millionare!");
            case 29:
                System.out.println("You will get your job !");
            default:
                System.out.println("You are going to retired real soon!");
        }
    }
}