public class Main {
    public static void main(String[] args) {
        //TODO: методы вызываемые последовательно называются стеком вызовов
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко", 80);
        vasyaBasket.add("Хлеб", 40);

        Basket petyaBasket = new Basket(500);
        petyaBasket.add("Лопата", 280);
        petyaBasket.add("Бочка", 2900);

        Basket mashaBasket = new Basket("Стол",5000);

        vasyaBasket.print("Корзина Васи:");
        System.out.println();
        petyaBasket.print("Корзина Пети:");
        System.out.println();
        mashaBasket.print("Корзина Маши:");

    }
}