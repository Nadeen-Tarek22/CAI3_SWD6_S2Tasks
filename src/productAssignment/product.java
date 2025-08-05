package productAssignment;

public class product {
    private int productID;
    private String productName;
    private int price;
    private int stock;


    public product(int productID, String productName, int price, int stock) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(int price) {
        if(price <0){
            System.out.println("price can not be negative");
        }
        else {
            this.price = price;
        }
    }

    public void setStock(int stock) {
        if(stock <0){
            System.out.println("stock can not be negative");
        }
        else {
            this.stock = stock;
        }
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}
