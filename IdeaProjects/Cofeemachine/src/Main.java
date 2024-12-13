public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 1;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1;
        //int lowLactoseMilkAmount = 1000;

        boolean isBlocked = true;

        int capuchinoMilkRequired = 60;
        int capuchinoCoffeeRequired = 15;

        boolean milkIsEnough = milkAmount >= capuchinoMilkRequired;
        boolean coffeIsEnough = coffeeAmount <= capuchinoCoffeeRequired;

        if ( !isBlocked && coffeIsEnough && milkIsEnough) {
            System.out.println("Молока достаточно");
        } else {
            System.out.println("Молока недостаточно");
        }
    }
}