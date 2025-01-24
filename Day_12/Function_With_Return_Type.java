package Day_12;

public class Function_With_Return_Type {

    // what is function with return type
    // function with return type is a function that takes some input and perform some operation and return some output
    // function with return type is also known as function with parameter

    // create a function with return type

    static int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    static int get_number(){
        return 10;
    }

    public static void main(String[] args) {
        
        // calling function with return type
        int result = add(10, 20);
        System.out.println("Sum of a and b is: "+result);

        int number = get_number();
        System.out.println("Number is: "+number);

    }
    
}
