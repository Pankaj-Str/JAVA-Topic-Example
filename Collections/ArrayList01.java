package Collections;
import java.util.ArrayList;
public class ArrayList01 {

    public static void main(String[] args) {

        // create a array list 
        ArrayList<String> data = new ArrayList<String>();

        // add data into array list 
        data.add("Java");
        data.add("Python");
        data.add("C++");
        data.add("C#");
        data.add("Ruby");

        // print array list 

        System.out.println("Array List: " + data);

        // remove item from array list
        data.remove("C++");

        System.out.println("Array List after removing C++: " + data);

        // remove item from array list using index
        data.remove(1);

        System.out.println("Array List after removing item at index 1: " + data);

        // get item from array list using index

        String item = data.get(1);
        System.out.println("Item at index 1: " + item);

        // set item at index 1
        data.set(1, "JavaScript");

        System.out.println("Array List after setting item at index 1: " + data);

        // print using for loop

        System.out.println("Array List using for loop: ");

        for(String item1: data) {
            System.out.println(item1);
        }


    }
}