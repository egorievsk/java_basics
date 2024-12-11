import java.awt.desktop.AboutEvent;

public class Main {
    public static void main(String[] args) {

        //ЗАНЯТИЕ 10.2. Массивы.
        int[] floors = {3,10,17,22,16,14};
        System.out.println(floors[3]);
        floors[0] = 555;
        System.out.println(floors[0]);
        long[] stats = {34,56421457532484L};

        //создание пустого массива и присвоение значения последнему элементу массива
        int[] numbers = new int[20];
        numbers[19] = 567;
        String[] words = new String[10];
        words[0] = "4";
        System.out.println(words[4]); //массив String содержит значения null

        //вызов методов создающих массивы
        String text = "Hello my friend Alex";
        String[] array = text.split("[^a-zA-Z]+");

        //ЗАНЯТИЕ 10.3. Работа с массивами в циклах
        //пример 1. Сертификаты, выйгрышные сертификаты
        int certCount = 1000;
        int winnerRate = 100;
        int[] certNums = new int[certCount];
        boolean[] certIsWin = new boolean[certCount];
        for (int i = 0; i < certNums.length; i++) {
            certNums[i] = 1_000_000 + (int) Math.round(8_999_999 * Math.random());
            certIsWin[i] = i % winnerRate == 0;
        }

        //пример 2. Комнаты на этажах и расчёт их площади
        int[] rooms = {15,22,22,23,22,22,23};

        double roomArea = 5.72;
        double[] roomsAreas = new double[rooms.length];
        for (int i = 0; i < rooms.length; i++) {
            roomsAreas[i] = rooms[i] * roomArea;
        }

        //Товары в Интернет магазине, и делает скиду тем что больше 1000 рублей
        Product[] products = {
                new Product("Молоко", 75),
                new Product("Масло",120),
                new Product("Сыр", 180),
                new Product("Чайник", 1890),
                new Product("Фильтр для воды", 1200)
        };

        int MIN_PRICE_FOR_DISCOUNT = 1000;
        double discount = 0.1;
        //данный цикл реализован т.к. переменные name, price в Product иммутабельны (private final)
        //иначе можно использовать цикл for(Product product : products) {}, где изменяем сами товары а не создаём копии
        for(int i = 0; i < products.length; i++) {
            Product product = products[i];
            int price = product.getPrice();
            if (price > MIN_PRICE_FOR_DISCOUNT) {
                int newPrice = (int) (price * (1 - discount));
                products[i] = new Product(product.getName(), newPrice);
            }
        }

        for(Product product : products) {
            System.out.println(product);
        }


    }
}