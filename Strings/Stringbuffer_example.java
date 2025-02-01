package Strings;

public class Stringbuffer_example {

    public static void main(String[] args) {
        
        StringBuffer str = new StringBuffer("Hello World");
        System.out.println(str);

        // String Concatenation
        str.append(" Java");

        System.out.println(str);

        // String Length
        System.out.println("Length of the string is: " + str.length());

        // String Comparison

        StringBuffer str1 = new StringBuffer("Hello");
        StringBuffer str2 = new StringBuffer("Hello");
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str)); // false
    
}
}
