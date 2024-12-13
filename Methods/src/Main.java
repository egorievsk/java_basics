import javax.lang.model.type.PrimitiveType;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        calulateTriangleSquare(3, 4, 5);
//        Student st = new Student("Sasha", 25);

//        Product product = new Product("bread",50);
//        Product product1 = new Product("oil",256);
//        Product product2 = new Product("table",2956);
//
//        System.out.println("Общее количество продуктов: " + Product.getCount());
//        System.out.println("Средняя стоимость продуктов: " + Product.getAveragePrice());
        ArithmeticCalculator calc = new ArithmeticCalculator(10,6);
        System.out.println(calc.calculate(Operation.SUBTRACT));
        System.out.println(calc.calculate(Operation.ADD));
        System.out.println(calc.calculate(Operation.MULTIPLY));

    }




    public static void calulateTriangleSquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double square = Math.sqrt(
                p * (p - a) * (p - b) * (p - c)
        );
        System.out.println(square);
    }
}