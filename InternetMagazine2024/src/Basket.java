import java.lang.runtime .TemplateRuntime;

public class Basket {

    private String items = "";
    private int totalPrice = 0;
    private int limit;

    public Basket() {
        items = "Список товаров: ";
        limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public void add(String name, int price, int count) {
        boolean errors = false;
        if (contains(name)) {
           errors = true;
        }
        if (totalPrice + count * price >= limit) {
            errors = true;
       }
        if (errors) {
            System.out.println("Error occured :(");
        }
        items = items + "\n" + name + " - " +
                count + "шт. " + price;
        totalPrice = totalPrice + count * price;
    }

//TODO:    нельзя писать код с таким же порядком параметров
//    public void add(String name, int price) {
//  *
//    }

//TODO:   но можно писать с обратным порядком параметров
    public void add(int count, String name) {

    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void clear()  {
        items = "";
        totalPrice = 0;
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    private boolean contains(String name) {
        return items.contains(name);
    }

}
