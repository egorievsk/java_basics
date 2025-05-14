public interface Printer {
    void printBlackAndWhite();
    default void printColor() {
        System.out.println("Print color");
    }
}
