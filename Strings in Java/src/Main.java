import java.sql.SQLOutput;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Strings in Java

        // Methods for creating String
        String str = new String("This is first method for creating string");
        System.out.println(str);
        String str2 = "This is second method for creating string";
        System.out.println(str2);


        // String Methods in Java

        String newStr = "Kush Kumar is currently learning new Things";
        System.out.println(newStr.length());  // Length
        System.out.println(newStr.toLowerCase()); // Converting the string to lowercase
        System.out.println(newStr.toUpperCase(Locale.ROOT)); // Converting the string to uppercase
        String Str = "Kush";
        System.out.println(Str.trim()); // Trim() method will remove whitespaces
        System.out.println(newStr.substring(4)); // Substring gives the string from specified index
        System.out.println(newStr.substring(5,17)); // Gives the string from specified starting position to specified ending position
        System.out.println(newStr.replace('K','c')); // Replaces the charachter string with the specified string character
        System.out.println(newStr.startsWith("Ku")); // gives true or false if string is starting with specified string or not
        System.out.println(newStr.endsWith("ngs")); // gives true or false if string is ending with specified string or not
        System.out.println(newStr.charAt(2)); // gives the charachter value as per index given.
        System.out.println(newStr.indexOf("s")); // gives the index value as per the charachter value specified.
        System.out.println(newStr.indexOf("h",5)); // gives the index value as per the charachter value from where it should start calculating that.
        System.out.println(newStr.lastIndexOf("i")); // gives the last index value as per the charachter value
        System.out.println(newStr.lastIndexOf("i",30)); // gives the lastIndex of the charachter value and from where the counting should start.
        System.out.println(Str.equals("kush"));  // checks whether the given string equals to specified string.
        System.out.println(Str.equalsIgnoreCase("kush")); // it first ignores the case and then try to see whether it equals to same string created.
    }
}