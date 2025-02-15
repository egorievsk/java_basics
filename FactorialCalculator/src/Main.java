import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число для расчета факториала: ");
        int value = new Scanner(System.in).nextInt();
        if (value < 12 && value > 1) {
            int factorial = 1;
            for (int i = 1; i <= value; i++) {
                factorial = factorial * i;
            }
            System.out.println("Факториал числа " + value + "!" + " = " + factorial);
        } else {
            System.out.println("Введенное число должно быть более 1 или менее 12");
        }
    }

}