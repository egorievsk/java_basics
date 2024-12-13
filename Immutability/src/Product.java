public class Product {
    private final String name;
    private int price;

    private final String barCode;

    public Product(String name) {
        this.name = name;
        this.barCode = "40154926190";
    }

    public String getName(){
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
