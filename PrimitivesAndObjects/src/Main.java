import javax.crypto.spec.PSource;

public class Main {
    //TODO: заполнение примитивов значениями по умолчанию происходит только,
    // когда примитив является параметром класса, как ниже:
    public static Product product;
    public static int price;
    public static void main(String[] args) {
        //TODO: в методе при объявлении переменной ей обязательно нужно присвоить значение - инициализировать
        int milkPrice;
        System.out.println(product);
        System.out.println(price);
        //System.out.println(milkPrice);
        byte b = 120;
        //byte v = b + b; //*переполнение
        long s = 4643213245454654641L;

        /*
        /7.4. BYTE - Байт
        /систем счисления
        /десятеричная цифры  0-9
        /двоичная, цифры 0-1,
        /шестнадцатеричная, цифры 0-9, буквы A-F
        /всего 256 символов от -128 до 127
        /Mbps - Megabits per second
        /Биты кило, мега - 1000, 100000
        /Байты: 1 Кб = 1024, 1 Мб = 1024*1024 = 1048576
         */

        /*
        7.5 Числа (типы)
        byte - 8 бит (от -128 до 127)
        short - 16 бит (-32768 до 32767)
        int   - 32 бит (-2147483648 до 2147483647)
        long  -  64 бита.
         */

        byte d = 127;
        d++;
        System.out.println(d);

        int a = 2000000000;
        int k = -1500000000;
        int comparison = a - k;
        System.out.println(comparison);;
        if (comparison > 0) {
            System.out.println("Число a больше числа k");
        } else {
            System.out.println("Число k больше числа а");
        }

        //числа с плавающей точкой
        //float и double, занимают 32 и 64 байта в памяти

        double n = -820645000000000.0;
        System.out.println(n);

        float l = 140000000000000000000F;
        System.out.println(l);





    }

    public static void addComission(Product product) {
        product.setPrice(product.getPrice() + 10);
    }
}