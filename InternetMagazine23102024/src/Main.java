public class Main {
    public static void main(String[] args) {
        //TODO: методы вызываемые последовательно называются стеком вызовов
        Product product = new Product("Молоко",56);
//        Product b = product;
//        product.setName("Сок");

//        System.out.println(product);
//        System.out.println(b);

        Order order = new Order();
        order.addProduct(product);
        System.out.println(product);

    }
}