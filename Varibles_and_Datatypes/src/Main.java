public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Variables in Java  -- used to store the values its like a container
        // Nanimg convention for writing Variables

        // 1. variable name should not start with numbers like 1harry
//        int 1harry = 10; -- will give error

//        2. variable names are case sensitive like harry and Harry is different
//        int harry = 100;
//        int Harry = 200;

//        3. Variable name must not contain any whitespace between the words like Harry code
//        byte harry num = 10; -- will give error

//        4. Variable name can contain symbols and it can start with _(underscore ) symbol
//            byte _kush = 100;

        // ----------------------------------------------------------------------------------

//      DataTypes in Java
//      1.Primitive Datatype -- byte,short,int,long,float,double,char,boolean

//      byte -- size == 1byte , range == -(2^8)/2 to -(2^8)/2-1 (means -128 to 127 )
        byte number = 127;
        System.out.println(number);

//      char -- size == 1 byte , range == 0 to 65536
        char words = 'K';
        System.out.println(words);

//      short -- size == 2byte , range == -(2^16)/2 to (2^16)/2-1
        short num = 255;
        System.out.println(num);

//      int -- size == 4 byte , range == -(2^32)/2 to (2^32)/2-1
        int numb = 2343434;
        System.out.println(numb);

//      float -- size == 4 byte , range == can't be determined
        float decim = 233.44f;
        System.out.println(decim);


//      long -- size == 8 byte , range == -(2^64)/2 to (2^64)/2-1
        long num2 = 243435434;
        System.out.println(num2);


//      double -- size == 8 byte , range == can't be determined
        double floating = 24343543.5533;
        System.out.println(floating);

//     boolean -- size == depends on Jvm , range == can't be determined at all.
       boolean condition = true;
       System.out.println(condition);

    }
}