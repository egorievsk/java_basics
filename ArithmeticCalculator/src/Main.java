public class Main {
    public static void main(String[] args) {
        ArithmiticCalculator arC = new ArithmiticCalculator(5,6);
        System.out.println(arC.calculate(Operation.SUBTRACT));
        System.out.println(arC.calculate(Operation.ADD));
        //System.out.println(arC.calculate(Operation.MULTIPLY));
    }
}