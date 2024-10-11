public class Main {

    static int add(int ...arr){
        int sum=0;
        for(int a: arr){
            sum += a;
        }
        return sum;
    }

    static int substract (int x , int ...arr){
        int result = x;
        for (int i =0;i<arr.length;i++){
            result -= arr[i];
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(add());  // here we can give this as an argument
        System.out.println(add(1));
        System.out.println(add(2,4));
        System.out.println(add(3,54,6));
        System.out.println(add(2,4,5,67,8));

        System.out.println("Printing the value after substraction");
        System.out.println(substract(1));  // but here we cannot give substract() without any argument because we have given the neccessary variable as a parameter.
        System.out.println(substract(20,10));
        System.out.println(substract(400,60,200));

    }
}