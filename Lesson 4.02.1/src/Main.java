import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      calculateTriangleSquare(3, 4, 5);
//      int sum = calculateSum(300, 200, 700);
//      System.out.println(sum);
        //int maxNumber = max(300, 10);
        //System.out.println(maxNumber);

//        Order v1 = new Order();
//        v1.addProduct(201, 40000);
//        v1.addProduct(317, 12000);
//        Order v2 = new Order();
//        v2.addProduct(20, 15);
//        v2.addProduct(600, 256);
//        System.out.println("Количество: " + v1.getPrtoductCount());
//        System.out.println("Стоимость: " + v1.getTotalCost());
//        System.out.println("Количество: " + v2.getPrtoductCount());
//        System.out.println("Стоимость: " + v2.getTotalCost());

//        User dmitry = new User("Дмитрий", 45);
//        System.out.println("Пользователь: " + dmitry.getName() + ", " + dmitry.getAge() + " лет.");
//        User vasyly = new User("Василий", 16);
//        System.out.println("Пользователь: " + vasyly.getName() + ", " + vasyly.getAge() + " лет.");
//        User masha = new User("Маша", 26);
//        System.out.println("Пользователь: " + masha.getName() + ", " + masha.getAge() + " лет.");

        Employee dmitriy = new Employee("Дмитрий Алексеев",6567);
        dmitriy.printInfo();

    }

    //TODO: void у функции обозначает что функция не имеет возвращаемого значения и фактически void это замена
    // если функция фозвращает значение то вместо void указывается какой тип значения она возвращает
    // int, double, String, long и так далее
    // в самой же функци тогда а конце будет слово return
    public static void calculateTriangleSquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(square);
    }

    public static int calculateSum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    public static int max (int a, int b) {
        return a >= b ? a : b;
    }
}