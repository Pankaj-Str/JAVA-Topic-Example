package SuperKeyword;


class Card {

    void info(){
        System.out.println("Card name - ICICI bank");
        System.out.println("Card type - Debit card");
        System.out.println("Card number - 1234 5678 9012 3456");
        System.out.println("Card holder name - John Doe");
    }
    
}

class Bank extends Card {

    void info(){
        super.info();
        System.out.println("Bank name - ICICI bank");
        System.out.println("Bank branch - Bangalore");
        System.out.println("Bank IFSC code - ICIC0001234");
    }
    
}

public class customer{
        
    public static void main(String[] args) {
        Bank b = new Bank();
        b.info();
    }    
}
