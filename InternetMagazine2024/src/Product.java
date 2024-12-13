public class Product {
    private final String name;
    private final int price;
    private int price2;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        this.price2 = price;
    }

    public String getName() {
        return name;
    }

    public Product productSetName(String name) {
        return new Product(name, price2);
    }

    public int getPrice() {
        return price;
    }

    public Product setProductPrice(int price) {
        return new Product(name, price);
    }

    public void setPrice(int price) {
        this.price2 = price;
    }

    public String toString() {
        return name + " - " + price;
    }
}
