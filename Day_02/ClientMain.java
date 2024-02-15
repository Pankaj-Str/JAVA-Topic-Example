package Day_02;

public class ClientMain {
    
    public static void main(String[] args) {
        
        // create a object of client class
        // className objectName = new className();

        Client client = new Client();
        client.ClientName = "joy";
        client.getClientInfo();
        client.ClientName = "Nishant";
        client.getClientInfo();
        
        Client client1 = new Client("mumbai",9800);
        Client client2 = new Client("Bhuj",5600);

    }

}
