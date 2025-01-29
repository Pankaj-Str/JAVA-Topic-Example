package InterFace;

interface Tax{
    void taxinfo();
}


public class client implements Tax{


    public void taxinfo(){
        System.out.println("Tax Info");
        System.out.println("Tax Amount: $100");
        System.out.println("Tax Type: Sales Tax");
    }

    public static void main(String[] args) {
        client c = new client();
        c.taxinfo();
    }
    
}