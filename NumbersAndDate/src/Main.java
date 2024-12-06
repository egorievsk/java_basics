import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static final double EPSILON = 0.000000001;

    public static void main(String[] args) {

        //Инкремент
        char b = 'b';
        b++;
        System.out.println(b);

        //постинкремент
        int value = 38;
        int post = value++; //переменной будет возвращено значение до инкремента (пост)
        System.out.println(post);
        System.out.println(value);

        //предекремент
        int value1 = 56;
        int pre = ++value1; //переменной pre будет возвращено значение после инкремента. Сначала идет операция инкремента
        System.out.println(pre);

        int value3 = Integer.MAX_VALUE;
        int saved = value3++; //сохраненное значение до инкремента
        System.out.println(value3++);

        int x = 50;
        int value4 = x++ + ++x;
        System.out.println(value4);

        double value5 = 35 / 20 + 75.5;
        //здесь 35 / 20 это целое числа и в результате получаемое 1.75, будет приведено к целому числу = 1
        //Итого: 1 + 75.5 = 76.5
        System.out.println(value5);

        double param = 0.75;
        int value6 = (int) param;
        System.out.println(value6);
        //неявное преобразование происходит только в сторону увеличения размерности.
        //int в double будет преобразовано, а наоборот - нет.
        // Из-за размера занимаемого в битах. int - 32 bit, double - 64 bit

        long now = System.currentTimeMillis();
        //при такой операции преобразуемое число должно обязательно влезть в число меньшей размерности
        int second = (int) (now / 1000);
        System.out.println(second);

        long value7 = 1000000000000L;
        System.out.println((int) value7);

        int number = 987654321;
        System.out.println("\n" +  number);
        float value8 = number;
        System.out.println("Преобразование чисел в числа с точной (float, double) будет происходить с потерей точности: " + value8);
        System.out.println("Потеря точности: " + (int) value8);

        //ТОЧНОСТЬ ВЫЧИСЛЕНИЙ

        double value9 = 24.0 * 0.1;
        System.out.println("24.0 * 0.1, Не будет равно точно 2.4: " + value9);

        double value10 = 0.3f * 0.4f;
        System.out.println("0.3f * 0.4f Не будет равно точно 0.12: " + value10);

        //числа double точнее float
        System.out.println((float) Math.PI);


        double value11 = 2.0 - 1.1;
        System.out.println(value11);
        double value12 = 0.9;
        System.out.println(value11 - value12);
        boolean comparisson = Math.abs(value11 - value12) < EPSILON;
        System.out.println(comparisson);

        long value13 = 100000000000000000L;
        double value14 = 100000000000000100.0;
        System.out.println(value13);
        System.out.println(value14);

        double value15 = 0;
        for (int i = 1; i < 1000000; i++) {
            value15 += 0.1;
        }
        System.out.println(value15);
        value15 = Math.round(value15);
        System.out.println(value15);

        //КЛАССЫ ДЛЯ ТОЧНЫХ ВЫЧИСЛЕНИЙ

        BigInteger integer = new BigInteger("6478364823654354334134356486238479");
        BigInteger integer1 = new BigInteger("64783648236486238479");
        //integer = integer.remainder(integer1);
        BigInteger integer2 = new BigInteger("6478364823654354334134356486237536");
        System.out.println(integer.pow(1000));

        double value16 = 2.438496;
        BigDecimal decimal = new BigDecimal("2.438496"); //значение необходимо передавать строкой
        BigDecimal decimal1 = new BigDecimal(value16); //
        System.out.println("Значение необходимо передавать строкой: " + decimal);
        System.out.println("Иначе будет неточное число: " + decimal1);

        BigDecimal decimal2 = new BigDecimal("5434132132141.54156415613013");
        BigDecimal decimal3 = new BigDecimal(3);
        System.out.println(decimal2.pow(1000));

        //ДАТА И ВРЕМЯ
        Date now1 = new Date();
        System.out.println(now1);

        LocalDate todate = LocalDate.now();
        System.out.println(todate);
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println(currentTime);

        LocalDate birthDate = LocalDate.of(1987, 4, 25);
        System.out.println(birthDate);
        System.out.println("Этому человеку исполнится 18 лет в " + birthDate.plusYears(18));

        LocalDateTime nowNY = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Curent time in New York: " + nowNY);

        //парсинг строки
        String date = "23/01/2021";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).localizedBy(new Locale("us"));
        //LocalDate localDate = LocalDate.parse(date,formatter);
        LocalDateTime now2 = LocalDateTime.now();
        //System.out.println("Отражение даты с парсингом " + localDate);
        System.out.println(formatter.format(now2));
        System.out.println(formatter1.format(now2));

        //сравнение дат
        LocalDateTime time1 = LocalDateTime.now();
        LocalDateTime time2 = LocalDateTime.now().minusDays(2);
        if (time1.isAfter(time2)) {
            System.out.println("time1 is after time2");
        }
        if (time1.isEqual(time2)) {
            System.out.println("time1 is after time2");
        }
        if (time1.compareTo(time2) > 0) {
            System.out.println("time1 is after time2");
        }

        //разница дат
        System.out.println(time1.until(time2, ChronoUnit.HOURS));


        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
        }
        System.out.println(System.currentTimeMillis() - start);





    }
}