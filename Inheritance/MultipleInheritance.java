package Inheritance;


interface gst{

    void gstinfo();  
    
}  


class Product{
    
    void productinfo(){
        System.out.println("Product Info");
        System.out.println("Product Name: Laptop");
        System.out.println("Product Price: $1000");
    }
    
}

class shop extends Product implements gst{
    
    public void gstinfo(){
        System.out.println("GST Info");
        System.out.println("GST Amount: $100");
        System.out.println("GST Type: Sales Tax");
    }
    
}


public class MultipleInheritance {
 
    public static void main(String[] args) {
        shop s = new shop();
        s.productinfo();
        s.gstinfo();
    }
    
}
