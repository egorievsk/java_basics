import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //ЗАНЯТИЕ 10.2. Массивы.
        int[] floors = {3, 10, 17, 22, 16, 14};
        System.out.println(floors[3]);
        floors[0] = 555;
        System.out.println(floors[0]);
        long[] stats = {34, 56421457532484L};

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
        int[] rooms = {15, 22, 22, 23, 22, 22, 23};

        double roomArea = 5.72;
        double[] roomsAreas = new double[rooms.length];
        for (int i = 0; i < rooms.length; i++) {
            roomsAreas[i] = rooms[i] * roomArea;
        }

        //Товары в Интернет магазине, и делает скиду тем что больше 1000 рублей
        Product[] products = {
                new Product("Молоко", 75),
                new Product("Масло", 120),
                new Product("Сыр", 180),
                new Product("Чайник", 1890),
                new Product("Фильтр для воды", 1200)
        };

        int MIN_PRICE_FOR_DISCOUNT = 1000;
        double discount = 0.1;
        //данный цикл реализован т.к. переменные name, price в Product иммутабельны (private final)
        //иначе можно использовать цикл for(Product product : products) {}, где изменяем сами товары а не создаём копии
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            int price = product.getPrice();
            if (price > MIN_PRICE_FOR_DISCOUNT) {
                int newPrice = (int) (price * (1 - discount));
                products[i] = new Product(product.getName(), newPrice);
            }
        }

        for (Product product : products) {
            System.out.println(product);
        }


        //МНОГОМЕРНЫЕ МАССИВЫ
        System.out.println("\n");
        System.out.println("МНОГОМЕРНЫЕ МАССИВЫ");
        System.out.println("\n");
        int[][] multydimensionalArray = new int[10][];
        //пример создания первого элемента массива, содержащего массив значений 5, 10, 15, 20
        multydimensionalArray[0] = new int[]{5, 10, 15, 20};

        //второй пример создания массива с 5 значениями, имеющими значения null
        multydimensionalArray[2] = new int[5];
        multydimensionalArray[2][4] = 10;

        //третий пример создания массива
        int[][] numbers1 = {
                {204, 17, 2, -67, 0},
                {34, 29, -5},
                {78, 12, 136, 11, 92, 89},
                {56, 4, 399, 808},
                {0, 321}
        };

        //Шахматная доска
        //создали
        Figure[][] board = new Figure[8][];
        board[0] = new Figure[]{
                new Figure(FigureColor.WHITE, FigureType.ROOK),
                new Figure(FigureColor.WHITE, FigureType.HORSE),
                new Figure(FigureColor.WHITE, FigureType.ELEPHANT),
                new Figure(FigureColor.WHITE, FigureType.KING),
                new Figure(FigureColor.WHITE, FigureType.QUEEN),
                new Figure(FigureColor.WHITE, FigureType.ELEPHANT),
                new Figure(FigureColor.WHITE, FigureType.HORSE),
                new Figure(FigureColor.WHITE, FigureType.ROOK)
        };
        board[1] = new Figure[8];
        board[6] = new Figure[8];
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Figure(FigureColor.WHITE, FigureType.PAWN);
            board[6][i] = new Figure(FigureColor.BLACK, FigureType.PAWN);
        }

        board[7] = new Figure[]{
                new Figure(FigureColor.BLACK, FigureType.ROOK),
                new Figure(FigureColor.BLACK, FigureType.HORSE),
                new Figure(FigureColor.BLACK, FigureType.ELEPHANT),
                new Figure(FigureColor.BLACK, FigureType.KING),
                new Figure(FigureColor.BLACK, FigureType.QUEEN),
                new Figure(FigureColor.BLACK, FigureType.ELEPHANT),
                new Figure(FigureColor.BLACK, FigureType.HORSE),
                new Figure(FigureColor.BLACK, FigureType.ROOK)
        };
        for (int i = 2; i < 6; i++) {
            board[i] = new Figure[8];
        }

        for (int row = 0; row < 8; row++) {
            for (int cell = 0; cell < 8; cell++) {
                Figure figure = board[row][cell];
                System.out.print(figure == null ? "--" : figure);
                System.out.print(cell < 7 ? " " : "\n");
                ;

            }
        }

        //пример трёхмерного массива
        //например для хранения данных о температуре на разных этажах, разных комнатах разное время суток
        int[][][] numbers3 = new int[10][][];

        //Класс Arrays
        System.out.println("\n");
        System.out.println("Класс Arrays");
        System.out.println("\n");
        int[] values = {234, 56, 88, 23969};
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));

        //сравнение массивов
        int[] a = {5,6,7,10};
        int[] b = {5,6,7};
        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.compare(a,b)); //степень отличия одинаковых массивов 0
        //копирование части массива
        int[] values1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] firstElements = Arrays.copyOf(values1, 5);
        System.out.println(Arrays.toString(firstElements));
        int[] fragment = Arrays.copyOfRange(values1, 2, 4);
        System.out.println(Arrays.toString(fragment));

        int[] values2 = new int[20];
        Arrays.fill(values2, -1);
        System.out.println(Arrays.toString(values2));


    }
}