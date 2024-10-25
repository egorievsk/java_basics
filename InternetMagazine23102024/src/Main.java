public class Main {
    public static void main(String[] args) {
        //TODO: методы вызываемые последовательно называются стеком вызовов
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко", 80);
        vasyaBasket.add("Хлеб", 40);

        Basket petyaBasket = new Basket();
        petyaBasket.add("Лопата", 280);
        petyaBasket.add("Бочка", 2900);

        vasyaBasket.print("Корзина Васи:");
        System.out.println();
        petyaBasket.print("Корзина Пети:");

    }
}