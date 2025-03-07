import javax.lang.model.type.PrimitiveType;
import java.awt.*;
import java.util.*;

import static java.net.Proxy.Type.HTTP;
import static javax.swing.text.html.FormSubmitEvent.MethodType.POST;

public class Main {
    public static void main(String[] args) {
        /*14.3 Интерфейсы
               Могут определять методы, которые реализуются в дочерних классах
               Не могут содержать реализацию методов, конструкторы и переменные
               могут устанавливаться константы,
               реализованы статические методы,
               реализованы default методы

               Класс может наследовать только один родительский класс,
               А интерфейсов может имплементировать (осуществлять) несколько!

               Интерфейсы:
                -описывают набор методов, реализуемых в классах-наследниках,
                -методы всегда публичные и не содержат реализацию,
                -не могут содержать переменных и конструкторы,
                -могут содержать статистические методы,
                -могут содержать default-методы,
                -наследуются при помощи слова implements
                -могут имплементировать сразу несколько интерфейсов сразу

                Интерфейсы бывают:
                    -поведенческие:
                        Устанавливают общий набор методов для всех классов наследников.
                        List, Collection Comparable.
                    - маркерные:
                        Обозначают дополнительные особенности классов (маркируют их).
                        Cloneable, Serializable
                        Сериализация и десериализация
                        Сериализация - процесс преобразования объекта в последовательность байтов (например для сохранения в файл)
                        Десериализация - процесс восстановления объекта из последовательности байтов (из файла).

                        ПОЛИМОРФИЗМ:
                            многообразие форм, в наших устройствах имеется множество одинаковых методов, но реализующих разный код
                        ВЛОЖЕННЫЕ КЛАССЫ:
                            -статические вложенные классы, созданные внутри другого класса,
                            -нестатические вложенные классы, созданные внутри другого класса,
                            -классы созданные внутри метода, локальные классы. class Chandelier
                            -анонимные классы.
                        Зачем нужны вложенные классы:
                            -для построения логичной архитектуры,
                            -для усиления инкапсуляции,
                            -для улучшения поддерживаемости.

        */

        ArrayList<Lamp> lamps = new ArrayList<>();

        Lamp lamp1 = new Lamp(100);
        //использование вложенного класса типа enum
        lamp1.setType(Lamp.Type.LUMINESCENT);

        lamps.add(new Lamp(100));
        lamps.add(new Lamp(20));
        lamps.add(new Lamp(40));
        lamps.add(new Lamp(150));
        Collections.sort(lamps);

        for (Lamp lamp : lamps) {
            System.out.println(lamp);
        }

        Printer printer = new SimplePrinter();
        printer.printBlackAndWhite();
        printer.printColor();

        SmartHouse.localClass obj = new SmartHouse.localClass();

        TreeSet<LightingDevace> lightingDevices = new TreeSet<>(new Comparator<LightingDevace>() {
            @Override
            public int compare(LightingDevace o1, LightingDevace o2) {
                return Integer.compare(o1.getPower(),o2.getPower());
            }
        });

        LightingDevace device = new LightingDevace(400) {
            @Override
            public double getEnergyConsumption() {
                return power * brightness;
            }
        };


    }
}