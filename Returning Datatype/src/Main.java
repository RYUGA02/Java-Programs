public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Returning DataType in Java

        // R = byte + short == int
        // R = short + int == int
        // R = byte + int == int
        // R = long + int == int
        // R = long + float == float
        // R = int + float = float
        // R =  char + float = Float
        // R = char + int = int
        // R = float + short = float
        // R = float + double = float
        // R = float + byte = float




        byte a = 10;
        short b = 20;
        int Result = a+b;
        System.out.println(Result);  // Result datatype is int


        short c = 30;
        int d = 40;
        int sum = c+d;
        System.out.println(sum); // sum datatype is int


        int e = 40;
        float f = 50.2344f;
        float total = e+f;
        System.out.println(total);


        float g = 60.12323f;
        double h = 234.3232323d;
        double answer = g+h;
        System.out.println(answer);


    }
}