//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко", 80);
        vasyaBasket.add("Хлеб", 40);

        Basket petyaBasket = new Basket(500);
        petyaBasket.add("Лопата",280);
        petyaBasket.add("Бочка",2900);


        Basket mashaBasket = new Basket("Стол", 5000);

        vasyaBasket.print("Корзина Васи:");
        System.out.println();
        petyaBasket.print("Корзина Пети:");
        mashaBasket.print("Корзина Маши:");

    }
}