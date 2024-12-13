public class Arithmetic {

    private int value1;
    private int value2;

    public Arithmetic(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int summTwoNumbers() {
        return value1 + value2;   
    }

    public int multiplicationNumbers() {
        return value1 * value2;
    }

    public int maximumFromTwoNumbers() {
        return value1 >= value2 ? value1 : value2;
    }

    public int minimumFromTwoNumbers() {
        return value1 <= value2 ? value1 : value2;
    }
}
