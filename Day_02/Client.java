package Day_02;

public class Client {

    String ClientName;

    Client(){

        System.out.println("Joy Food Store");

    }


    Client(String city,int price){

        System.out.println("Client City "+city);
        System.out.println("Client Food "+price);

    }

    void getClientInfo(){
        
        System.out.println("Client Name : "+ClientName);

    }
    
}