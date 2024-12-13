
public class Printer {

    private String queue = ""; //очередь - список документов
    private int pagesInQieue = 0; //количество в очереди на печать
    private int amountPrintedPages = 0; //количество распечатанных страниц

    public void append(String text) {
        String name = "Документ без имени";
        append(text, name);
    }

    public void append(String text, String name) {
        int pagesCount = 1;
        append(text, name, pagesCount);
    }

    public void append (String text, int pagesCount) {
        String name = "Документ без имени";
        append(text, name, pagesCount);
    }

    public void append (String text, String name, int pagesCount) {
        queue = queue + "\n" + name + " - " + text;
        pagesInQieue = pagesInQieue + pagesCount;
    }

    public void clear() {
        pagesInQieue = 0;
        queue = "";
    }

    public void print () {
        amountPrintedPages = amountPrintedPages + pagesInQieue;
        System.out.println(queue);
        clear();
    }

    public int getPendingPagesCount() {
        return pagesInQieue;
    }

    public int getPrintedCount() {
        return amountPrintedPages;
    }
}
