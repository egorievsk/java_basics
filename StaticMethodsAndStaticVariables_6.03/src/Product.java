public class Product {
    private final String name;
    private final int price;

    public static int count;
    public static int totalPrice;

    Product(String name, int price) {
        count = count + 1;
        totalPrice = totalPrice + price;
        this.name = name;
        this.price = price;
    }

    public String getName() {return name;}

    public int getPrice() {return price;}

    public static int getCount() {
        return count;
    }

    public static double getAveragePrice() {
        return (double)  totalPrice / count;
    }
}

