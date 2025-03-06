public class SimplePrinter  implements Printer, LaserPrint {

    @Override
    public void printBlackAndWhite() {
        System.out.println("Print black and white");
    }

    @Override
    public void printColor() {
        Printer.super.printColor();
    }

}
