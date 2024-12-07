import org.w3c.dom.ls.LSOutput;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
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


        //Преобразование числа в строку
        Integer age1 = 37;
        int age2 = 38;
        String name2 = "Anna";
        String personInfo1 = name2 + " - " + age1 + " лет";   //1 - неявное преобразование
        String value = String.valueOf(age2);                 //2- при помощи метода valueOf() класса String
        String value1 = Integer.toString(age2);             //3 - при помощи метода toString класса Integer, Double и т.д.
       //

        //преобразование числа в строку
        String value3 = "65465465";
        int count = Integer.parseInt(value3);   //при помощи метода parseInt() класса Integer
        System.out.println(count);

        String weigth= "6873.241687654"; //следует учитывать что здесь при преобразовании строки в число может возникнуть ошибка, если класс и его метод parseInt не соответствует получаемому числу
        double count2 = Double.parseDouble(weigth);


        //Символы и кодировки
        String hello = "Hello";
        char[] chars= hello.toCharArray();
        for (char symbol : chars) System.out.println(symbol);

        System.out.println(System.lineSeparator());

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }

        char firstChar = hello.charAt(3);
        System.out.println(firstChar);

        String str = "This is line of test for counting space";
        int spaceCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        System.out.println(spaceCount);

        //метод strip() удаление пробелов и символов табуляции в различных операционных системах
        String text3 = " Some spaces at the start and at the and    ";
        System.out.println(text3);
        String clearedText3 = text3.strip();
        System.out.println(clearedText3);

        //методы isDigit() и isLetter()
        String text4 = "1990 year";

        if (Character.isDigit(text4.charAt(0))) {
            System.out.println("This is a digit");
        } else {
            System.out.println("This is not a digit");
        }

        char ty = (char) 6500;
        String yu = String.valueOf(ty);
        System.out.println(yu);
        ty = Character.valueOf(ty);
        boolean io = Character.isIdeographic(ty);
        System.out.println(ty);

        //кодировка в Java

        //кодировка по умолчанию
        System.out.println(Charset.defaultCharset());

        //метод getBytes() - позволяет узнать символы в данной кодировке getBytes("Windows-1251") или getBytes()

        String text7 = "Привет";
        byte[] textBytes = text7.getBytes(StandardCharsets.UTF_8);
        for(byte textByte : textBytes) System.out.println(textByte + " ");


        String text8 = "Привет всем";
        byte[] textBytes1 = text8.getBytes(Charset.forName("Windows-1251"));
        for (byte textByte1 : textBytes1) {
            System.out.println(textByte1 + " ");
        }

        //смена кодировки
        String text9 = "Hello всем";
        String encoding = new String(text9.getBytes(), StandardCharsets.US_ASCII);
        System.out.println(encoding);

    }
}