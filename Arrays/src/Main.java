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


    }
}