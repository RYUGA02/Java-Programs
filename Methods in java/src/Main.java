public class Main {

     int smallest_number(int a, int b, int c){
        int answer;
     if((a<b) && (a<c)){
        answer =  a;
     }
     else if((b<a) && (b<c)){
         answer = b;
     }
     else{
         answer = c;
     }
     return answer;
    }

    public static void main(String[] args) {

        int a = 200;
        int b = 30;
        int c = 40;
//
//        int result = smallest_number(a,b,c);
//        System.out.println("The smallest number is :"+result);



        // Method invocation using object creation
        Main obj = new Main();
        int result = obj.smallest_number(a,b,c);
        System.out.println("The smallest number is :"+result);
    }
}