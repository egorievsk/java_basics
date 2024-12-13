import java.util.function.DoubleToIntFunction;

public class Product {

    private final String name;
    private final String barCode;
    private int price;

    public Product(String name, int price, String barCode) {
        this.name = name;
        this.price = price;
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getBarCode() {return barCode;}

    public void setPrice(int price) {
        this.price = price;
    }
}
