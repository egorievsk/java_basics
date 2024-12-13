import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Product {
    private final String name;
    private final int price;

    //final - означает иммутабельность - неизменяемость переменной

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product setName(String name) {
        return new Product(name, price);
    }
    public String getName() {
        return name;
    }

    public Product setPrice(int price) {
        return new Product(name, price);
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return name + " - " + price;
    }

    public void print() {
        String info = name + " - " + price;
        System.out.println(info);
    }


}
