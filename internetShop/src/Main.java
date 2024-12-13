public class Main {
    public static void main(String[] args) {
        Product product = new Product("молоко",56);
        Order order = new Order();
        order.addProduct(product);
        System.out.println(product);
        product.print();


        //Если мы хотим создать объект какого то класса, то сначала пишем имя этого класса
        //затем имя переменной-----
        /*
         * 
         */
        //Корзина васинаКорзина
        //оператор new обозначает создание объекта
//        Basket vasyaBasket = new Basket();
//        vasyaBasket.add("Молоко", 80);
//        vasyaBasket.add("Хлеб", 40);
//
//        Basket petyaBasket = new Basket(500);
//        petyaBasket.add("Лопата", 280);
//        petyaBasket.add("Бочка", 2900);
//
//        Basket mashaBasket = new Basket("Стол",
//                5000);
//
//        Basket sashaBasket = new Basket();
//        sashaBasket.add("Компьютер",32000,2);
//
//        vasyaBasket.print("Корзина Васи:");
//        petyaBasket.print("Корзина Пети:");
//        mashaBasket.print("Корзина Маши:");
//
//        sashaBasket.print("Корзина Саши:");
//
//        Employee employee = new Employee(5,"бумага");
//        employee.printValue("Новые данные");
    }
}