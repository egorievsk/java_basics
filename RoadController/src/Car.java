import java.util.Scanner;

public class RoadController {
    private static double passengerCarMaxWeght = 3500.0; //kg
    private static int passengerCarMaxHeigth = 2000; //mm
    private static int controllerMaxHeght = 4000; //mm

    private static int passengerCarPrice = 100; //RUB
    private static int cargoCarPrice = 250; //RUB
    private static int vehicleAddidionalPrice = 200; //RUB
    public static void main(String[] args) {
        System.out.println("Сколько автомобилей сгенерировать?");

        int carsCount = new Scanner(System.in).nextInt();

        for (int i = 0; i < carsCount; i++) {
             Car car = Camera.getNextCar();
            System.out.println(car);

            //Пропускаем автомобили спецтранспопрта бесплатно
            if (car.isSpecial) {
                System.out.println("Шлагбаум открывается... Счастливого пути!");
                continue;
            }

            //Проверяем высоту автомобиля, вычисляем стоимость проезда
            int price = calculatePrice(car);
            if (price == -1){
                continue;
            }

            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }
    }

    private static int calculatePrice(Car car) {
        int carHeight = car.heigth;
        int price = 0;
        if(carHeight > controllerMaxHeght) {
            System.out.println("Провезд невозможенЖ высота вашего Э + " +
                    "ТС превышает высоту пропускного пункта");
            return -1;
        } else if (carHeight > passengerCarMaxHeigth) {
            double weight = car.weght;
            //Грузовой автомобиль
             if(weight > passengerCarMaxWeght) {
                 price = passengerCarPrice;
                 if (car.hasVehicle) {
                     price = price + vehicleAddidionalPrice;
                 }
            }
             //легковой автомобиль
            else {
                price = cargoCarPrice;
             }
        } else {
            price = passengerCarPrice;
        }
        return price;
    }
}



public class Car {
    public String number;
    public int heigth;
    public double weght;
    public boolean hasVehicle;
    public boolean isSpecial;

    public String toString() {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ" : "";
        return "\n=========================================\n" +
                special + "Автомобиль с номером " +
        ":\n\tВысота: " + heigth + " мм\n\tМасса: " + weght + " кг";
    }
}
