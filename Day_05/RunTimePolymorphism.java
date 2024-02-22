package Day_05;

class client{

    void order_info(){
        System.out.println("order - 101");
        System.out.println("order - 102");
        System.out.println("order - 103");
    }

}

class orders extends client{

    void order_info(){
        super.order_info();
        System.out.println("Food");
        System.out.println("cloths");
        System.out.println("Toy");
    }

}


public class RunTimePolymorphism {
    public static void main(String[] args) {
    orders orderss = new orders();
    orderss.order_info();
    }
}
