package Day_11.Single;



/**
 * BookPrice
 */
public class BookPrice extends Books {

    int Book_price;
    int Discount;
    int Final_price;

    void get_bookPrice(){

        System.out.println("Book Price is: "+Book_price);
        System.out.println("Book Discount is "+Discount);
        System.out.println("Final Price is "+Final_price);

}

    public static void main(String[] args) {
        BookPrice bookPrice = new BookPrice();
        bookPrice.Book_price = 100;
        bookPrice.Discount = 10;
        bookPrice.Final_price = bookPrice.Book_price - bookPrice.Discount;
        bookPrice.get_bookPrice();
        bookPrice.title = "java Tutorial";
        bookPrice.author = "Nishant";
        bookPrice.year = 2024;
        bookPrice.info();
        

    }

}