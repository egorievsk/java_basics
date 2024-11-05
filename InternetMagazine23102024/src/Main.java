public class Main {
    public static void main(String[] args) {
        //TODO: методы вызываемые последовательно называются стеком вызовов
        createBasket();

        Session session = new Session();

        System.out.println(Basket.getCount());

    }

    //TODO: статический метод доступен для класса в целом (НЕ ОБЪЕКТА) и может вызываться только из другого статического метода
    public static void createBasket() {
        Basket basket = new Basket("goods",120);
    }

    //TODO: если предполагается работа с методом через объекты, то такой метод должен быть не статический
    //TODO: если работа с методами предполагается за пределами объекта и работает с переменными класса, то метод должен быть статическим


    DeliveryOrder  deliveryOrder = new DeliveryOrder(Pedestrian.PEDESTRIAN,Fragile.NO,Cold.YES);

}