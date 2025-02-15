public class Main {
    public static void main(String[] args) {

        System.out.println("Система расчета стоимости топлива");

        int fuelType = 678;
        int amount = -98;
        var hasDiscount = amount  > 10;

        //int Можено заменить на var  - синтаксический сахар, но использование var не устоялось
        double fuel92Price = 68.2;
        double fuel95Price = 67.33;

        double discount = 0.1;

        int AmountMax = 400;

        var wrongFuelTypeMessage = "Указан неверный тип топлива!";

        double fuelPrice = 0;
        if (fuelType == 92) {
            fuelPrice = fuel92Price;
        }
        else if (fuelType == 95) {
            fuelPrice = fuel95Price;
        }else {
            System.out.println(wrongFuelTypeMessage);
        }

        if (hasDiscount) {
            fuelPrice = (1 - discount) * fuelPrice;
        }
        if (amount < 1) {
            System.out.println("Указано слишком малое количество топлива.");
            amount = 0;
        }

        String fuelPriceMessage = "Цена выбранного топлива " + fuelPrice + " руб.";

        if (amount > AmountMax) {
            System.out.println("Указанное количество топлива превышает максимально допустимое");
            amount = AmountMax;
        }
        System.out.println(fuelPriceMessage);

        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки " + totalPrice + " руб.");
        }
}
