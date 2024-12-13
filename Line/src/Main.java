import org.w3c.dom.ls.LSOutput;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        //МЕТОДЫ РАБОТЫ С ПОДСТРОКАМИ

        //метод indexOf("подстрока")
        //он же но с порядковым номером символа с которого надо искать (не включая сам порядковый номер)
        //метод lastIndexOf("substring") - аналогичен indexOf() но ищет с конца строки
        //метод substring(начальный порядковый номер, конечный порядковый номер символа)

        String header1 = "Content-Type: text/html; charset=utf-8;";
        String header2 = "Content-Type: text/html; charset=Windows-1251;";
        String header3 = "Content-Type: text/html; charset=ISO-8859-1;";

        String header4= "Content-Type: text/html;";
        String header5 = "Content-Type: text/html; charset=";
        String header6 = "Content-Type: text/html; charset=;";

        System.out.println(getEncoding(header1));
        System.out.println(getEncoding(header2));
        System.out.println(getEncoding(header3));
        System.out.println(getEncoding(header4));
        System.out.println(getEncoding(header5));
        System.out.println(getEncoding(header6));

        String name3 = "Alexey";
        String name4 = "Georgy";
        String name5 = "Alexey";

        //ОБЪЕДИНЕНИЕ СТРОК
        //метод StringJoiner("строка, символ, набор символов разделителей")
        //метод add("добавляемая строка") класса StringJoiner

        //класс String так же имеет метод join

        StringJoiner joiner = new StringJoiner(", ");
        joiner.add(name3);
        joiner.add(name4);
        joiner.add(name5);

        System.out.println(joiner);

        String list = String.join(", ",name3, name4,name5);
        System.out.println(list);

        //форматирование строк
        String name6 = "Максим";
        int birthYear = 1986;
        //нужно вывести в формате:
        //{"name" : "Максим", "birthYear" = "1986"}
        String template = "{\"name\" : \"%s\", \"birthYear\": \"%d\"}";
        String result = String.format(template,name,birthYear);
        System.out.println(result);
        System.out.printf(template,name,birthYear);

        System.out.println();

        String result1 = "{\"name\""; //пример экранирующего символа для вывода кавычек в тексте
        System.out.println(result1);

        //ПУЛ СТРОК
        //String Pool
        String name7 = "Alex";
        String name9 = "Alex";  //при  сравнении строк name7 name9 будут равны
        String name8 = new String("Alex");
        System.out.println(name7 == name8); //а name7 и name8 не будут, т.к. name8 создана при помощи конструктора new String("какой то текст")
        System.out.println(name7 == name8.intern());    //метод intern() позволяет сравнить сравнить значение переменной полученной присваиванием и переменной созданной конструктором new String


        //9.7. РЕГУЛЯРНЫЕ ВЫРАЖЕНИЯ

        //замена фрагментов строк на другие при помощи регулярного выражения "формата" [^0-9] [^0-9a-z] и метода replaceAll([^ф,о-т], "строка")
        //значок ^ обозначает что все символы кроме цифр.
        //regex - выражение позволяющее выбрать нужные или убрать ^, отфильтровать ненужные символы
        String phone1 = "+7 903 712-37-54";
        String phone2 = "+7 (903) 968-60-45";
        String phone3 = "7999-666-66-66";
        String phone4 = "7(903)9616245";
        String tr = "try";
        System.out.println(formatPhoneNumber(phone1));
        System.out.println(formatPhoneNumber(phone2));
        System.out.println(formatPhoneNumber(phone3));
        System.out.println(formatPhoneNumber(phone4));
        System.out.println(formatPhoneNumber(tr));

        //Разбиение строк на фрагменты

        String text10 = "I know something about it; isn't";
        String[] words = text10.split("[;?][\\s]"); //"\s" - обозначает любой пробельный символ
        for(String word : words) {
            System.out.println(word);
        }
        System.out.println(System.lineSeparator());

        String text11 = "I  know\tsomething  about\n it";
        String[] words1 = text11.split("\\s+");
        for (int i = 0; i <= words1.length -1; i++) {
            System.out.println(words1[i]);
        }

        //Проверка соответствия строк шаблону
        String numberAvto = "А674МР197";
        String lettersRange = "[АВЕКМНОРСТУХ]";
        String regex = lettersRange + "[0-9]{3}" + lettersRange + "{2}[0-9]{2,3}";
        System.out.println(numberAvto.matches(regex));

        System.out.println(System.lineSeparator());

        //Поиск фрагментов строк, соответствующих шаблону

        String text12 = "Алексей, добрый день!\nМой гитхаб — https://github.com/, а также ссылка на мой персональный сайт — https://www.skillbox.ru/\nЕсли возникнут вопросы, пишите мне напрямую. Я всегда доступен";
        String regex1 = "https://[^,\\s]+"; //означает что могут встречаться любые символы кроме пробельного и запятой
        Pattern pattern = Pattern.compile(regex1);

        Matcher matcher = pattern.matcher(text12);
        while(matcher.find()) {
            int start1 = matcher.start();
            int end = matcher.end();
            System.out.println(text12.substring(start1,end));
        }

        System.out.println(System.lineSeparator());

        //Маски в регулярных выражениях

        String text14 = "Дмитрий сообщил следующее: «Я вернусь в 12:40 и, будьте добры, подготовьте к этому времени все документы!» На что Анна ему ответила: «А документы-то так и не привезли». Дмитрий удивлённо посмотрел на неё и сказал: «Ну и ладно», — вздохнул, махнул рукой и удалился.";
        String regex2 = "«([^»]+)»"; //в круглые скобки помещено содержимое цитаты. Отличается от регулярного выражения наличием скобок
        Pattern pattern1 = Pattern.compile(regex2);
        Matcher matcher1 = pattern1.matcher(text14);
        while(matcher1.find()) {
            String citation = matcher1.group(1);
            System.out.println(citation);
        }







    }

    public static String formatPhoneNumber(String phone) {
        String regex = "[^0-9a-z]"; // регулярное выражение
        return phone.replaceAll(regex, "");
    }

    public static String getEncoding(String header) {
        String charsetStr = "charset=";
        int start = header.indexOf(charsetStr);
        int end = header.indexOf(';',start);
        if (start < 0 || end < 0) {
            return "";
        }

        String encoding = header.substring(start + charsetStr.length(), end);

        return encoding;

    }
}