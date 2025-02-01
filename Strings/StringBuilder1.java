package Strings;

public class StringBuilder1 {

    public static void main(String[] args) {
        
       // string builder

         StringBuilder str = new StringBuilder("Hello World");

          System.out.println(str);

          // String Concatenation

          str.append(" Java");

          System.out.println(str);


          // String Length
          System.out.println(str.length());


          // String Comparison
          System.out.println(str.equals("Hello World Java"));


          // upper case and lower case
          System.out.println(str.toString().toUpperCase());
          System.out.println(str.toString().toLowerCase());

    }

}
