public class Main {
    public static void main(String[] args) {
        int paperReserve = 600000;
        int inkReserve = 600000;
        int coverReserve = 2000;

        double printRollerMinTemp = 80.5;
        double printRollerMaxTemp = 120.75;

        int pagesInBook = 530;
        int booksCount = 2000;

        boolean coldPrintingMode = false;
        double printRollerTemp = 50;

        int paperCount = booksCount * pagesInBook / 2;
        int linkedPapersCount = paperCount + booksCount;

        boolean CountIsEnough = paperCount <= paperReserve && linkedPapersCount <= inkReserve && booksCount <= coverReserve;
        boolean RollerPrint = printRollerTemp > printRollerMinTemp && printRollerTemp < printRollerMaxTemp || coldPrintingMode;

        if (CountIsEnough && RollerPrint) {
            System.out.println("Печать разрешена");
        }else {
            System.out.println("Печать запрещена");
        }
    }
}