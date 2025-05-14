public class SimplePrinter implements Printer, LaserPrint{
    @Override
    public void printBlackAndWhite() {
        System.out.println("Print black and white");
    }

    @Override
    public void printColor() {
        System.out.println("Print more color");
        Printer.super.printColor();
    }


}
