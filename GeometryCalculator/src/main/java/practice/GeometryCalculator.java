package practice;

public class GeometryCalculator {

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getCircleSquare(double radius) {
        return radius < 0 ? -1 : Math.PI * radius * radius;
    }

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getSphereVolume(double radius) {
        return radius < 0 ? -1 : (double) 4 / (double) 3 * Math.PI * radius * radius * radius;
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        boolean isTrianglePossible = true;
        if (a + b <= c) {
            isTrianglePossible =  false;
        } else if (a + c <= b) {
            isTrianglePossible =  false;
        } else if (b + c <= a) {
            isTrianglePossible = false;
        }
        return isTrianglePossible;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if (isTrianglePossible(a, b, c) == false) {
            return -1;
        }
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
