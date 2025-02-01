package Strings;

public class String_Example01 {


    public static void main(String[] args) {
        
        String str = "Hello World";
        System.out.println(str);


        // String Concatenation

        String str1 = "codes with";
        String str2 = "Pankaj";

        String str3 = str1 + " " + str2;

        System.out.println(str3);


        // String Length

        String data = "codes with Pankaj";

        int length = data.length();
        System.out.println("Length of the string is: " + length);


        // String Comparison

        String str4 = "Hello";
        String str5 = "Hellow";

        if(str4.equals(str5)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        // upper case and lower case

        System.out.println(data.toUpperCase());
        System.out.println(data.toLowerCase());

        // String Substring

        String data1 = "codes with Pankaj";
        System.out.println(data1.substring(0, 10));


        // String Replace

        System.out.println(data1.replace("Pankaj", "Nishant"));


        // String Split

        
        String[] words = data.split(" ");
        for(String word: words){
            System.out.println(word);
        }

        

    }
    
}
