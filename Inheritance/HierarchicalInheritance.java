package Inheritance;


class Customers{

    void customerinfo(){
        System.out.println("Customer Info");
        System.out.println("Name: John Doe");
        System.out.println("Age: 20");
    }

}
class CreditCard extends Customers{

    void creditcardinfo(){
        System.out.println("Credit Card Info");
        System.out.println("Card Type: Visa");
        System.out.println("Card Number: 1234 5678 9101 1121");
    }

}
class loan extends Customers{

    void loaninfo(){
        System.out.println("Loan Info");
        System.out.println("Loan Amount: $1000");
        System.out.println("Loan Type: Personal Loan");
    }

}




public class HierarchicalInheritance {
    
    public static void main(String[] args) {
        CreditCard c = new CreditCard();
        loan l = new loan();
        c.customerinfo();
        c.creditcardinfo();
        l.customerinfo();
        l.loaninfo();
        }   
        
}
