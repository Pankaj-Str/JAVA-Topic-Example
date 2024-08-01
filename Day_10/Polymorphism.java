package Day_10;

/**
 * Polymorphism
 */
public class Polymorphism {

    public static void main(String[] args) {
        Orders orders = new Orders();
        Orders orders1 = new Orders(101);
        Orders orders2 = new Orders("John");
        orders.getinfo();
        orders.getinfo(101);
        orders.getinfo(101,"joy");
    }
}