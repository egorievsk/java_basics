import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        //Написать цикл, который будет выводить числа от 0 до 10
//        System.out.println("Вывод чисел от 0 до 10");
//        for (int value = 0; value <= 10; value = value + 1) {
//            System.out.println(value);
//        }
//
//        //Написать цикл, который будет выводить числа от 5 до 15
//        System.out.println("Вывод чисел от 5 до 15");
//        for (int num = 5; num <= 15; num = num + 1) {
//            System.out.println(num);
//        }
//
//        //Написать цикл, который будет выводить числа от 10 до 0
//        System.out.println("Вывод чисел от 10 до 0");
//        int item;
//        for (item = 10; item >= 0; item = item - 1) {
//            System.out.println(item);
//        }
//
//        //Написать цикл, который будет выводить числа от 17 до 9
//        System.out.println("Вывод чисел от 17 до 9");
//        int item1;
//        for (item1 = 17; item1 >= 9; item1 = item1 - 1) {
//            System.out.println(item1);
//        }
//
//        //Написать цикл, который будет выводить только чётные числа от 0 до 10 (0, 2, 4, 6, 8 и 10)
//        System.out.println("Вывод четных чисел от 0 до 10");
//        int value1;
//        for (value1 = 0; value1 <= 10; value1 = value1 + 2) {
//            System.out.println(value1);
//        }

        int sum = 0;

        System.out.println("Введите число и нажмите <Enter>:");

        while (true) {
            int value = new Scanner(System.in).nextInt();
            if (value > 0) {
                sum = sum + value;
                System.out.println("Сумма: " + sum);
                System.out.println("Введите еще одно число или 0 для сброса суммы");
            }else {
                sum = 0;
                System.out.println("Сумма сброшена. Введите новое число:");
            }
        }
    }
}