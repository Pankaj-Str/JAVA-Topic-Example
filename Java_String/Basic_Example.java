package Java_String;

public class Basic_Example {


    public static void main(String[] args) {
        
        String data = "welcome to codes with pankaj";
        System.err.println(data);

        String First_Name = "Joy";
        String Last_Name = "Jain";
        String Full_Name = First_Name + " " + Last_Name;

        System.err.println("Full Name is "+Full_Name);

        // upper()

        System.out.println(Full_Name.toUpperCase());
        System.out.println(Full_Name.toLowerCase());

        // len

        System.out.println(Full_Name.length());

        // substring(int beginIndex):

       
        System.out.println(data.substring(10));
        
        // substring(int beginIndex, int endIndex)

        System.out.println(data.substring(10,20));

        String str1 = "p4n";
        String str2 = "P4n";
        
        // equals(String anotherString)

        System.err.println(str1.equals(str2));

        // equalsIgnoreCase(String anotherString):

        System.out.println(str1.equalsIgnoreCase(str2));
    
        // startsWith(String prefix)

        System.out.println(data.startsWith("codes"));

        // endsWith(String suffix)
        System.err.println(data.endsWith("pankaj"));
    }
    
}
