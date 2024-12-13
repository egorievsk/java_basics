import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int value = new Scanner(System.in).nextInt();
        if (value > 0) {
            for (int i = 1; i <= value; i++) {
                for (int num = 1; num <= value; num++) {
                    if (i * num == value) {
                        System.out.println(i + "*" + num);
                    }
                }
            }
        }
    }
}