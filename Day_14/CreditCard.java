package Day_14;

public class CreditCard {

    // create a constructor
    // what is a constructor?
    // a constructor is a special method that is used to initialize an object of a class in java

    // create a constructor
    // default constructor
    CreditCard() {
        System.out.println("Credit Card Constructor");
    }

    // create a parameterized constructor
    // parameterized constructor

    CreditCard(String cardNumber, String cardHolderName, String expiryDate, int cvv) {
        System.out.println("Credit Card Constructor");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder Name: " + cardHolderName);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("CVV: " + cvv);
    }
    
}
