public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;

    public Basket() {
        increaseCount (1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + "\n" + items + " - " + 1 + " шт. - " + totalPrice;
        this.totalPrice = totalPrice;
    }

    public Basket(String items, int totalPrice, double weight) {
        this();
        this.items = this.items + "\n" + items + " - " + 1 + " шт. - " + totalPrice;
        this.totalPrice = this.totalPrice + totalPrice;
        this.totalWeight = this.totalWeight + weight;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }
        if(totalPrice + price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }
        totalWeight = totalWeight + weight;
        add(name,price,1);
    } 

//    public void add(String name, int price, int count, double weight) {
//        Basket.count = Basket.count + count;
//        totalWeight = totalWeight + weight;
//        add(name,price,count);
//    } 

    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
