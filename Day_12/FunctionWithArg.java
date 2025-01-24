package Day_12;

public class FunctionWithArg {


    // what is function with argument
    // function with argument is a function that takes some input and perform some operation and return some output
    // function with argument is also known as function with parameter


    // create a function with argument

    static void add(int a, int b){
        int sum = a + b;
        System.out.println("Sum of a and b is: "+sum);
    }

    public static void main(String[] args) {
        
        // calling function with argument
        add(10, 20);

    }

    
}
