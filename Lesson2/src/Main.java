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

        boolean paperIsEnough  = paperCount <= paperReserve;
        boolean inkIhsEnough = linkedPapersCount <= inkReserve;
        boolean coversAreEnough = booksCount <= coverReserve;
        boolean rollerTempIsNormal = printRollerTemp > printRollerMinTemp && printRollerTemp < printRollerMaxTemp;

        boolean CountIsEnough = paperIsEnough && inkIhsEnough && coversAreEnough;
        boolean RollerPrint = rollerTempIsNormal || coldPrintingMode;

        boolean errors = false;

        if (!paperIsEnough ) {
            errors = true;
            System.out.println("Бумаги едостаточно");
        } else if (!inkIhsEnough) {
            errors = true;
            System.out.println("Чернил недостаточно");
        } else if (!coversAreEnough) {
            errors = true;
            System.out.println("Обложек недостаточно");
        } else if (!coldPrintingMode && !rollerTempIsNormal) {
            errors = true;
            System.out.println("Неверный режим печати или температура печатающего ролла недопустимая");
        }

        String message = !errors ? "Печать разрешена" : "Печать запрещена";
        System.out.println(message);

    }
}