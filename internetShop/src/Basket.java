import java.awt.image.BufferStrategy;

public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit;

    //private int count;

    //задается изначальное значение limit
    //для того класса у которго нет необходимости передавать в круглых скобках какое то значение ограничения
    public Basket() {
        items = "Список товаров:";
        this.limit = 1000000;
    }

    //это конструктор инициализации (присвоения значения) данных при создании объекта
    //то есть items, totalPrice объявлены в классе, а limit не имеет значения
    public Basket(int limit) {
        this(); //этот класс
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        if (contains(name)) {
            return;
        }
        if (totalPrice + count * price >= limit) {
            return;
        }
        //"\n" - символ переноса строки
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

    public boolean contains(String name) {
        //строка имеет метод contains который проверяет наличие в этой строке определенной строки
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        //isEmpty() - метод проверки содержимого строки
        if(items.isEmpty()) {
            System.out.println("Корзина пуста");
        }else {
            System.out.println(items);
        }
    }


}
