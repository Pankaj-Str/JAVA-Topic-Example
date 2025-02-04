package Map;

import java.util.HashMap;

public class Mapexample {

    public static void main(String[] args) {
        

        HashMap<Integer,String> data = new HashMap<Integer,String>();

        data.put(101, "cloth");
        data.put(102, "shoes");
        data.put(103, "book");
        data.put(104, "pencil");
        data.put(105, "bag");
        data.put(106, "watch");


        // print data 
        System.out.println("Data: " + data);

        // remove data 
        data.remove(102);

        System.out.println("Data "+data);

        // get all keys 

        System.out.println(data.get(101));


        // interating (fatch data using loop)

        for(HashMap.Entry<Integer,String> u_data : data.entrySet()){
            System.out.println(u_data.getKey() + " " + u_data.getValue());
        }

    }
    
}
