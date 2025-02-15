
public class Main {
    public static void main(String[] args) {

        int coffeeAmount = 1;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1;
        int lowLactoseMilkAmount = 1;

        boolean isBlocked = true;

        int cappucinoMilkRequired = 60; // in gramms
        int cappucinoCoffeeRequired = 15; //in gramms

        boolean milkIsEnough = skimmedMilkAmount >= cappucinoMilkRequired ||
                milkAmount >= cappucinoMilkRequired;

        //TODO: check another types of coffee

        boolean coffeeIsEnough = coffeeAmount >= cappucinoCoffeeRequired;

        boolean hasErrors = false;

        if (isBlocked) {
            System.out.println("Кофе-машина заблокирована!");
            //TODO: some action
            hasErrors = true;
        }

        /*
        ksdfjnhgkjfdshngkjnfd
        ,mnbkjbnkjnkjn
         */

        /**
         * lkdcfjnvglkdfjnglk
         * ;lfm,g;lfdm,g;l
         */


        if (!coffeeIsEnough) {
            System.out.println("Кофе недостаточно");
            hasErrors = true;
        }

        if (!milkIsEnough) {
            System.out.println("Молока недостаточно");
            hasErrors = true;
        }

        if (!hasErrors == false) {
            System.out.printf("Готовим кофе");
        }
    }
}