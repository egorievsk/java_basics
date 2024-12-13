public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(EngineType.GAS,1598,101);

        Car car = new Car(engine, CarType.HATCHBACK,2689);

        System.out.println("Тип автомобиля: " + car.carType);
        System.out.println("Масса автомобиля: " + car.weigth);
        System.out.println("Тип двигателя: " + car.engine.engineType);
        System.out.println("Объём двигателя: " + car.engine.volume);
        System.out.println("Мощность двигателя: " + car.engine.power);
    }
}