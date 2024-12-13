public class ArithmiticCalculator {
    private int a;
    private int b;
    private int d;

    public static int result;

    ArithmiticCalculator(int a, int b) {
        this.a = a; this.b = b;
    }

    public int calculate(Operation operation) {
        if (operation == Operation.ADD) {
            result = a + b;
        } else if (operation == Operation.SUBTRACT) {
            result = a - b;
        } else if(operation == Operation.MULTIPLY) {
            result = a * b;
        }
        return result;
    }
}
