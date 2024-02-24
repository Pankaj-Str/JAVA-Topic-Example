package Day_06;

import java.util.Scanner;

public class UserInput {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int size;

        System.out.println("\n---------Enter List Size ----------\n");

        size = sc.nextInt();

        String[] food = new String[size];
        
        for (int i = 0; i < size; i++) {

            System.out.println(" \n enter food name = " + (i+1));
            food[i] = sc.next();

        }

        System.out.println("---------out put list ---------------\n");

        for (int i = 0; i < size; i++) {

            System.out.println((i+1)+". = "+food[i]);
            

        }


    }


}
