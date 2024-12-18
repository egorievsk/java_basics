import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RoadCamera {

    public static void main(String[] args) throws IOException {
        //Параметры программы
        int maxOncomingSpeed = 30; // km/h
        int speedFineGrade = 20; // km/h
        int finePerGrade = 500; // RUB
        int criminalSpeed = 180; // km/h

        System.out.println("Введите скорость автомобиля:");

        //Скорость автомобиля
        //int oncomingSpeed = Integer.parseInt(
        //    (new BufferedReader(new InputStreamReader(System.in))).readLine());
        int oncomingSpeed = new Scanner(System.in).nextInt();

        if (oncomingSpeed >= criminalSpeed) {
            System.out.println("Вызов полиции...");
        } else if (oncomingSpeed > maxOncomingSpeed) {
            int overSpeed = oncomingSpeed - maxOncomingSpeed;
            int gradesCount = overSpeed / speedFineGrade;
            int fine = finePerGrade * gradesCount;
            System.out.println("Сумма штрафа: " + fine);
        } else {
            System.out.println("Скорость не превышена");
        }
    }
}