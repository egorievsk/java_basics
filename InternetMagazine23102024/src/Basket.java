import java.time.Period;

public class Basket {
    private String items;
    private int totalPrice = 0;
    private int limit;

    private static int count = 0; //TODO: статическая переменная доступна в самом классе, вызывается при обращении к классу.

    private static int timeoute = getTimeOut();

    //TODO: статическая инициализация
    private static int getTimeOut() {
        int secoundsInHour = 3600;
        int hoursInDays = 24;
        int daysInWeek  = 7;
        int daysInMonth = 30;
    }
    //TODO: конструктор нужен для инциализации переменных b
    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
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

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
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
