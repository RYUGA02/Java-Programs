import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Taking input from Student in all 5 subjects
        System.out.println("Enter marks scored in Maths :");
        int a = sc.nextByte();
        System.out.println("Enter your marks scored in Physics :");
        int b = sc.nextByte();
        System.out.println("Enter your marks Scored in Biology :");
        int c = sc.nextByte();
        System.out.println("Enter your marks scored in Chemistry :");
        int d = sc.nextByte();
        System.out.println("Enter your marks scored in History :");
        int e = sc.nextByte();
        float sum = a+b+c+d+e;

        float percentage = sum / 6;
        System.out.println(percentage);


    }
}