package ExceptionHandling;
import java.util.Scanner;
public class Hospital {
    
    public static void main(String[] args) {
        
        // create a BMI calculator 
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter your weight in kg: \n");
        int weight = sc.nextInt();
        System.out.println("\n Enter your height in meters: \n");
        int height = sc.nextInt();
        double bmi = weight / (height * height);

        if(bmi < 18.5){
            throw new ArithmeticException("Underweight");
        } else if(bmi >= 18.5 && bmi < 24.9){
            System.out.println("Normal weight");
        } else if(bmi >= 25 && bmi < 29.9){
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    } catch(ArithmeticException e){
        System.out.println("Do not Enter 0 for height");


    }
    
}
}
