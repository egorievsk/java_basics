public class Printer {

    private String queue = "";
    private int countPrintedPages = 0;
    private int pagesInQueue = 0;

    public void append(String name, String text, int countPages) {
        queue = queue + "\n" + name + " - " + text;
        pagesInQueue = pagesInQueue + countPages;
        //countPrintedPages = countPrintedPages + countPages;
    }

    public void append(String text, int countPrintPages) {
        append("Документ без имени", text, countPrintPages);
    }
    public void append(String text, String name) {
        append(name, text, 1);
    }

    public void append(String text) {
        append("Документ без имени", text, 1);
    }

    public void clear() {
        queue = "";
        pagesInQueue = 0;
    }

    public void print () {
        System.out.println(queue);
        countPrintedPages = countPrintedPages + pagesInQueue;
        clear();
    }

    public int getPrintedPagesCount() {
        return countPrintedPages;
    }

    public int getPendingPagesCount() {
        return pagesInQueue;
    }
}
