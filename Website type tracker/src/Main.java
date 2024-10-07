import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

      // This Program is used to tell website domain name
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Name of the Website:");
        String Website = sc.next();
        if(Website.endsWith(".org")){
            System.out.println("This is an Organisational Website.");
        }
        else if(Website.endsWith(".com")){
            System.out.println("This is a Commercial Website.");
        }
        else if(Website.endsWith(".in")){
            System.out.println("This is an Indian Website.");
        }
    }
}