package Day_04;

/**
 * Encapsulation
 */
public class Encapsulation {

    public static void main(String[] args) {
        Client client = new Client("joy",101 , 1200.34f);
        String Client_name = client.getClientName();
        int orders_No = client.getOrdersNo(); 
        float price_p = client.getPrice();
        
        System.out.println("Client Name : "+Client_name);
        System.out.println("Client Order No. : "+orders_No);
        System.out.println("Client Name price: "+price_p);

        client.setClientName("Rohit");

        System.out.println("Client Name : "+client.getClientName());
        System.out.println("Client Order No. : "+client.getOrdersNo());
        System.out.println("Client Name price: "+client.getPrice());

    }

}