import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // This is a Rock-Paper-Scissor game program.
        // generating random number
        Random rand = new Random();
        int Number = rand.nextInt(3) + 1;

        // taking input from the user
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter 1 for Rock");
        System.out.println("Enter 2 for Paper");
        System.out.println("Enter 3 for Scissor");
        int User = Input.nextInt();
        System.out.println("Cpu Random Generated Number is :"+Number);
        switch (User) {
            case 1:

                if(Number == 2){
                    System.out.println("Cpu Won!");
                }
                else if(Number == 3){
                    System.out.println("Player Won!");
                }
                else if(Number == 1){
                    System.out.println("Tied!");
                }
                else{
                    System.out.println("Put the value in Range of 1-3");
                }
                break;


            case 2 :
                if(Number == 1){
                    System.out.println("Cpu Won!");
                }
                else if(Number == 3){
                    System.out.println("Cpu Won!");
                }
                else if(Number == 2){
                    System.out.println("Tied!");
                }
                else{
                    System.out.println("Put the value in Range of 1-3");
                }
                break;

            case 3 :
                if(Number == 1){
                    System.out.println("Player Won!");
                }
                else if(Number == 2){
                    System.out.println("Player Won!");
                }
                else if(Number == 3){
                    System.out.println("Tied!");
                }
                else{
                    System.out.println("Put the value in Range of 1-3");
                }
                break;
        }
    }
}
