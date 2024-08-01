package Day_10;
public class Orders{
    
    Orders(){
        System.out.println("Orders class is initialized");
    }
    Orders(int id){
        System.out.println("Orders class is initialized "+id);
    }
    Orders(String name){
        System.out.println("Orders class is initialized "+name);
    }   
    
    // methods overloading 

    void getinfo(){
        System.out.println("This is a default method");
    }
    void getinfo(int id){
        System.out.println("This is a method with id parameter"+id);
    }

    void getinfo(int id, String name){
        System.out.println("this is multi perameter name "+name);
        System.out.println("this is multi perameter id "+id);
    }
    
}
