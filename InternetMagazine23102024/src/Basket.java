public class Basket {
    private String items = "";
    private int totalPrice = 0;

    public static void main(String[] args) {

    }

    public void add(String name, int price) {
        if (contains(name)) {
            return;
        }
        items = items + "\n" + name + " - " + price;
        totalPrice = totalPrice + price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
            return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
            System.out.println(items);
        } else {
            System.out.println(items);
        }
    }
}
