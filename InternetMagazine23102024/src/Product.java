public class Product {
    public final String name;
    public final int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//    public String getName() {
//        return name;
//    }

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
