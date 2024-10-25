
public class Basket {

    private static String items = "";
    private static int totalPrice = 0;

    public static void main(String[] args) {
        add("Sousage", 76);
        add("Milk", 55);
        add("butter", 120);
        print("Basket content:");
        System.out.println(getTotalPrice());
        clear();
        print("Basket content:");
        System.out.println(getTotalPrice());
    }

    public static void add(String name, int price) {
        items = items + "\n" + name + " - " + price;
        totalPrice = totalPrice  + price;
    }

    public static void clear() {
        items = "";
        totalPrice = 0;
    }

    public static int getTotalPrice() {
        return totalPrice;
    }

    public static void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Basket is empty");
        }
        else {
            System.out.println(items);
        }
    }
}
