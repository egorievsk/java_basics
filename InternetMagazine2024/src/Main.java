import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int priceC;

    private static int MAX_AGE = 8;

    public static void main(String[] args) {

        int priceB = 5;

        System.out.println(priceB);

        //TODO: для переменных новой переменной присвоенное значение старой переменной является новой переменной которая никак не меняется
        int aa = 5;
        int bb = aa;
        aa = aa + 1;
//        System.out.println(aa);
//        System.out.println(bb);

        //TODO: для объектов аналогичные действия приводят к созданию ссылки на тот же объект
        Product product = new Product("молоко",  56);
        Order order = new Order();
        order.addProduct(product);
        //System.out.println(product);

        Product pr1 =  product.setProductPrice(89);
        //System.out.println(pr1);

        //TODO: обращение к переменной класса Basket или Student
        // например Basket.count если count является public static
        System.out.println(Basket.getCount());

        //System.out.println(Student.adultAge);

        createBasket();
        Session session = new Session();
        System.out.println(Basket.getCount());


        //TODO: Создание класса как рекорд с заданными полями без конструкторов
        //  однако в таком рекорде можно создать собственный конструктор с другими значениями и их последовательностью
        //  можно создавать статические переменные и статические методы
        Student st1 = new Student("Вася Петров",18, true);
        Student st2 = new Student("Маша Распутина", 25);


        DeliveryOrder dorder = new DeliveryOrder(DeliveryType.PEDESTRIAN, Fragile.NO, Cold.YES);

        int milkPrice = 75;
        int icecreamPrice = 75;

        if(milkPrice == icecreamPrice) {
            System.out.println("Цены одинаковы");
        }
        Product milk = new Product("Milk", 75);

        addComission(milk);
        System.out.println(milk.getPrice());

        Product product1 = new Product("Milk", 75);
        Product product2 = product1;
        if (product1 == product2) {
            System.out.println("одинаковы");
        }

        byte b = 127;
        b++;
        System.out.println(b);

        int c = 2147483647;
        c++;
        System.out.println(c);

        int a = 2000000000;
        int g = -1500000000;
        int comparison = a - g;
        if (comparison > 0) {
            System.out.println("Число a больше числа g");
        } else{
            System.out.println("Число g больше числа a");
        }
        System.out.println(comparison);

        double d = 2348123456789012.0;
        System.out.println(d);

        long h = 12345678901L;

        float l = 30.0f;
        System.out.println(l);

        char symbol = 's';
        char symbol12 = 23;

        String newLine = System.lineSeparator();
        //аналогично "\r\n"
        System.out.println("первая строка" + newLine + "вторая строка");

        char tab = '\t';

        int tabCode = tab;
        System.out.println(tabCode);

        char tab1 = (char) 9;
        System.out.println(tab1);

//        for (int i = 0; i < 65536; i++) {
//            char k = (char) i;
//            System.out.println(i + " - " + k);
//        }

        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.POSITIVE_INFINITY);

        System.out.println(Integer.MAX_VALUE);

        //Классы обёртки
        Integer vasyaAge = 6; //это боксинг, упаковка примитива в соответствующий ему класс-обёртку
        Integer mishaAge = vasyaAge;
        vasyaAge = 7;
        System.out.println(mishaAge);
        System.out.println(vasyaAge == mishaAge);

        //TODO: в случае сравнения сложения или вычитания класс может быть распакован до примитива
        // где непосредственно значение класса сравнивается с другим примитивным значением
        if (vasyaAge <= MAX_AGE) {
            System.out.println("Вася может играть в эту игру");
        }

        Integer width = 76;
        Integer height = 85;
        System.out.println(calculateRectangleArea(width, height));

        double value = 5 / 2;
        System.out.println(value);

        int mod = 5 % 2; //остаток от деления
        System.out.println(mod);

        int value2 = 55;
        value2 /= 11; //операция присвоения вместо value2 = value2 / 11;
        System.out.println(value2);

        double a1 = 5.674;
        double b2 = 5.864;
        boolean comparison1 =  a1 >= b2;

        if (!comparison1) {
            System.out.println("a1 is less than b2");
        }

        System.out.println(Math.abs(-4875));
        System.out.println(Math.max(5,2));
        System.out.println(Math.sin(90));
        System.out.println(Math.tan(90));
        System.out.println(Math.sqrt(2));
        System.out.println(Math.round(2.54));
        System.out.println(Math.random());

    }

    public static void createBasket() {
        Basket basket = new Basket("goods",156);
    }

    public static void addComission(Product product) {
        product.setPrice(product.getPrice() + 10);
    }

    public static int calculateRectangleArea(int width, int heigth) {
        return width * heigth;
    }
}