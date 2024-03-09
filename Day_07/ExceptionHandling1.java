package Day_07;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.ArithmeticException;

class ExceptionHandling1{

    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name ");
        String name = sc.nextLine();

        System.out.println("Enter Your age ");
        int age = sc.nextInt();

        System.out.println("Enter your height");
        int height = sc.nextInt();

        int BMI = age/height;

        System.out.println("Your Name is "+name);
        System.out.println("BMI = "+BMI);
        }catch(InputMismatchException e){
            System.out.println("Enter Only Number .....");
        }catch(ArithmeticException e){
            System.out.println("do not enter zero value");
        }
        
    }

}