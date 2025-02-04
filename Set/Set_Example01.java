package Set;

import java.util.*;

public class Set_Example01 {

    public static void main(String[] args) {

        // set in python
        
        Set<Integer> data = new HashSet<>();

        data.add(100);
        data.add(200);
        data.add(300);
        data.add(100);
        data.add(400);


        System.err.println("data : "+data);

         // Check if an element is in the set
         boolean containsdata = data.contains(100); // true
         System.err.println(containsdata);

         // remove data 

         data.remove(200);
         System.err.println(data);
    

         for (Integer integer : data) {
                System.err.println(integer);
         }

    }

    
}
