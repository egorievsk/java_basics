public class Product {
    public final String name;
    public final int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product setName(String name) {
       return new Product(name, price);
    }

    public Product setPrice(int price) {
        return new Product(name, price);
    }
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return name + " - price " + price;
    }
    public void print() {
        String info = name + " - price " + price;
        System.out.println(info);
    }
}
