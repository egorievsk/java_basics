import javax.xml.xpath.XPathFunctionException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчета стоимости топлива");

        int fuelType = 95;
        int amount = 98;

        boolean hasDiscount = amount > 10;

        double fuel92price = 60.2;
        double fuel95price = 67.33;

        double fuelPrice = 0;

        double discount = 0.1;

        String wrongFuelTypeMessage = "Incorrect type fuel specified";

        if (fuelType == 92) {
            fuelPrice = fuel92price;
        } else if(fuelType == 95) {
            fuelPrice = fuel95price;
        } else {
            System.out.println(wrongFuelTypeMessage);
        }

        if (hasDiscount)
        {
            fuelPrice = (1- discount) * fuelPrice;
        }
        if(amount < 1) {
            System.out.println("Указано слишком малое количество топлива.");
            amount = 0;
        }
        String fuelPriceMessage = "Цена выбранного топлива: " + fuelPrice + " руб.";

        System.out.println(fuelPriceMessage);

        double  totalPrice = fuelPrice * amount;

        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");
    }
}