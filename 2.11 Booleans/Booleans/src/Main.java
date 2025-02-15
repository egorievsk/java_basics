
public class Main {
    public static void main(String[] args) {
        int milkAmount = 1000; // ml
        int powderAmount = 400; // g
        int eggsCount = 5; // items
        int sugarAmount = 10; // g
        int oilAmount = 30; // ml
        int appleCount = 5; // items

        /*
        Пример
         */
        // Example
        // apples - 5
        //if (appleCount >= 5) {
        //    System.out.println("Apple juice");
        //}

        // powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml

        boolean CookPancakes = powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30;

        if (CookPancakes) {
            System.out.println("Pancakes");
        }

        // milk - 300 ml, powder - 5 g, eggs - 5

        boolean CookOmelette = milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5;

        if (CookOmelette) {
            System.out.println("Omelette");
        }

        // apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (appleCount >=3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >=4) {
            System.out.println("Apple pie");
        }
    }
}