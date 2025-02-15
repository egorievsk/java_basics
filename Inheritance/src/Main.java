public class Main {
    public static void main(String[] args) {
        //13.2 Наследование классов Java
        //повторное использование кода уже существующих классов
        //super - Обозначение родительского класса

        Bus bus = new ElectricBus(0.001,0.1);
        bus.refuel(1);
        System.out.println("Резерв:" + bus.powerReserve());
        System.out.println("Едем 50 км:" +bus.run(50));
        System.out.println("Резерв:" + bus.powerReserve());
        System.out.println("Едем 900 км:" +bus.run(900));
        System.out.println("Резерв:" + bus.powerReserve());
        System.out.println("Едем 100 км:" +bus.run(100));
        System.out.println("Резерв:" + bus.powerReserve());

        /*13.3 Переопределение методов
            @Override - аннотация, обозначает переопределение метода класса Bus
            см. метод powerReserve() класса ElectricBus

            Запрет переопределения метода в классах наследниках
            для этого следует в методе указать ключевое слово final, что запретит его переопределение
            так же можно запретить наследование целого класса, указав слово final перед именем класса Bus
        */

        /*13.4 Переопределение статических методов
            не могут переопределяться
            если в дочернем классе создать тако же метод, то это будет новый отдельный метод этого класса
         */

        Bus bus1 = new Bus((0.001));
        Bus bus2 = new Bus((0.001));
        Bus bus3 = new Bus((0.001));

        ElectricBus ebus1 = new ElectricBus(0.001,0.1);
        ElectricBus ebus2 = new ElectricBus(0.001,0.1);

        System.out.println("Количество автобусов: " + Bus.getCount());
        System.out.println("Количество электробусов: " + ElectricBus.getCount());

        /*13.5 Класс Object
            Все классы наследуются от класса Object
            имеют общее поведение
            И могут переопределяться
            clone() - создает и возвращает копию объекта
            equals() - сравнение текущего объекта с переданным в параметре
            hashCode() - рассчитывает хэш
            finalize() - вызывается перед удалением объекта из памяти
            getClass() - возвращает класс текущего объекта
            toString() - возвращает строковое представление объекта

            //методы для синхронизации многопоточных приложениях
            notify()
            notifyAll()
            wait()
            wait(long timeoitMilis)
            wait(long timeoutMillis, int nanos)
         */
        Bus bus5 = new Bus(0.001);
        Bus bus6 = new Bus(0.001);
        System.out.println(bus5.equals(bus6));

        Bus bus7 = new Bus(0.001);
        Class objectCalss = bus7.getClass();
        System.out.println(objectCalss.getName());
        System.out.println(bus7.getClass() + "@" + Integer.toHexString(bus.hashCode()));
        System.out.println(bus7);

        //тест 2
    }
}