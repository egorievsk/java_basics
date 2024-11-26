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



    }
}