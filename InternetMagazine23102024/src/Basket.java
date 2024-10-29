public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit;

    //TODO: конструктор нужен для инциализации переменных b
    public Basket() {
        limit = 100000;
    }

    public Basket(int limit) {
        this(); //TODO: вызываем конструктор пустой Basket()
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    //TODO: перегрузка свойство создавать одноименные методы с разной сигнатурой
    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        if (contains(name)) {
            return;
        }
        if (totalPrice + price >= limit) {
            return;
        }
        items = items + "\n" + name + " - " +
                count + " шт. - "+ price;
        totalPrice = totalPrice + count * price;
    }

    public void add(int count, String name) {
        add(name,500, count);
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
