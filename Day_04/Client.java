package Day_04;

public class Client {
    
    String ClientName;
    int ordersNo;
    float price;
    public Client(String ClientName, int ordersNo, float price)
    {
        this.ClientName = ClientName;
        this.ordersNo = ordersNo;
        this.price = price;
    }
    public String getClientName() {
        return ClientName;
    }
    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }
    public int getOrdersNo() {
        return ordersNo;
    }
    public void setOrdersNo(int ordersNo) {
        this.ordersNo = ordersNo;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    

    
}
