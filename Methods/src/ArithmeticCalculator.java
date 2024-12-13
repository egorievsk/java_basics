public class ArithmeticCalculator {
    public int a;
    public int b;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate(Operation operation) {
        int result = 0;
        if (operation == Operation.ADD) {
            result = a + b;
        } else if (operation == Operation.MULTIPLY) {
            result = a * b;
        } else if(operation == Operation.SUBTRACT) {
            result = a - b;
        }
        return result;
    }
}
