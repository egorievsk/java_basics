import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int sum = 0;
        System.out.println("Введите число и нажмите <Enter>:");
//        while (true) {
//            int value = new Scanner(System.in).nextInt();
//            sum = sum + value;
//            if (value > 0) {
//                System.out.println("Сумма: " + sum);
//                System.out.println("Введите ещё одно число или 0 для сброса суммы:");
//            } else if (value == 0) {
//                sum = 0;
//            };
//        };

        do {
            int value1 = new Scanner(System.in).nextInt();

            if (value1 > 0) {
                sum = sum + value1;
                System.out.println("Сумма: " + sum);
                System.out.println("Введите ещё одно число или 0 для сброса суммы:");
            } else if (value1 == 0) {
                sum = 0;
            }
        }
        while (sum > 0);


    }
}