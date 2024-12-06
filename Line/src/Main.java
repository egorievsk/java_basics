import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String name1 = "Дмитрий";
        String empty = "";

        //метод длины строки
        boolean isEmpty = empty.length() == 0;
        //метод ЕстьПусто
        System.out.println(empty.isEmpty());

        //Метод проверки наличия пробельных символов, табуляции, переноса строки
        System.out.println(empty.isBlank());

        String blank = "\n  \t   ";
        System.out.println(blank.isBlank());

        //КОНКАТЕНАЦИЯ
        String name = "Василий";
        String surname = "Петров";
        int age = 55;

        LocalDate birthDate = LocalDate.of(1986,4,15);

        String personInfo = name + " " + surname + " - " + birthDate;
        System.out.println(personInfo);

        //метод toString()
        //есть у всех объектов.
        //у созданного класса он тоже есть, но его нужно реализовать
        //вызывается автоматически при передаче объекта в System.out.println()
        //У созданного класса Product он реализован нами и выделен голубым цветом как предопределенный метод

        Product mask = new Product("Мыло", 56);
        StringBuilder goods = new StringBuilder();

        //при множественной конкатенации программа начнёт работать сильно медленнее.
        long start = System.currentTimeMillis();
        for(int i = 1; i < 100_000; i++) {
            //goods += mask + "\n";
            goods.append(mask).append("\n");
        }
        System.out.println(System.currentTimeMillis() - start);
//        System.out.println(goods.length());

//        String allGoods = goods.toString();
//
//        long start1 = System.currentTimeMillis();
//        //allGoods = allGoods + mask;
//        allGoods = allGoods.concat(mask.toString()); //аналог конкатенации метод concat("добавляемая строка"), выполняемый гораздо быстрее - оптимизация
//
//        System.out.println(System.currentTimeMillis() - start1);

        //СРАВНЕНИЕ СТРОК
        String masnagerName = "Vasiliy";
        String customerName = "Vasiliy";
        System.out.println(masnagerName == customerName);
        String customerName1 = "Vasi".concat("liy");
        System.out.println(masnagerName == customerName1); //== сравнивает 2 объекта, а не их содержимое. А String это объект , т.к. с большой буквы String  а не string
        System.out.println(masnagerName.equals(customerName1)); //метод equals() сравнивает содержимое объекта а не сами объекты


    }
}