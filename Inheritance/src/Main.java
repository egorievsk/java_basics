public class Main {
    public static void main(String[] args) {
        //13.2 Наследование классов Java
        //повторное использование кода уже существующих классов

        Bus bus = new ElectricBus(0.001,0.1);
        bus.refuel(1);
        System.out.println("Резерв:" + bus.powerReserve());
        System.out.println("Едем 50 км:" +bus.run(50));
        System.out.println("Резерв:" + bus.powerReserve());
        System.out.println("Едем 900 км:" +bus.run(900));
        System.out.println("Резерв:" + bus.powerReserve());
        System.out.println("Едем 100 км:" +bus.run(100));
        System.out.println("Резерв:" + bus.powerReserve());

    }
}