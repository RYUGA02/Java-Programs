public class Main {

    static int recursion_recursive(int num){
        if(num ==0 || num ==1){
            return 1;
        }
        else{
            int factorial = num * recursion_recursive(num-1);
            return factorial;
        }
    }

    static int recursion_iterative(int num){
        if(num == 0 || num==1){
            return 1;
        }
        else{
            int product =1;
            for(int i=1;i<=num;i++){
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {

        System.out.println("The factorial of a number using recursive approach is :"+ recursion_recursive(5));
        System.out.println("The factorial of a number using recursive approach is :"+ recursion_iterative(5));
    }
}