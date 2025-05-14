import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        /*
        TODO: ABSTRACT CLASSES (Абстрактные классы)
         отличие обычных классов от абстрактных
         - объявляются как "abstract" без тела метода с использованием ключевого слова abstract
         - могут содержать abstract-методы
         - Их можно (нужно) наследовать
         - нельзя создавать экземпляры
         *****
         ЗАЧЕМ?
         * объединение в одном месте функционала, который должен быть свойственен дочерним классам
         * Для определения функционала (методов), который должен быть реализован в дочерних классах
         * При отсустсвии смысла создавать объекты таких классов
         extends может быть только одно
         */

        /* TODO: INTERFACE (Интерфейсы)
            это структуры в программном код, описывают набор методов, которые должны быть реализованы, всегда публичны
            не могут содержать реализацию методов
            исключения: могут устанавливаться константы и реализованы статические методы и default методы
            implements может быть от нескольких интерфейсов
         */

        /*TODO:
           Extends - это расширение существующего класса
           Implements - это претворение в жизнь (реализация, оживление) методов Интефейса
         */

        /*TODO: ПОЛИМОРФИЗМ - многообразие форм.
           разные классы имеют разную реализацию
           возможность работы с разными класами имплементирующими единый интерфейс
         */

        /*TODO: Вложенные классы:
                -Статические вложенные классы
                    -создаются внутри обычного класса
                -Нестатические внутренние классы
                    -как публичные так и приватные как снаружи класса так и внутри
                -Локальные классы (внутри методов)
                -Анонимные классы
         */

        ArrayList<Lamp> lamps = new ArrayList<>();
        lamps.add(new Lamp(100));
        lamps.add(new Lamp(20));
        lamps.add(new Lamp(40));
        lamps.add(new Lamp(150));
        Collections.sort(lamps);

        Lamp someObject = new Lamp(60);
        Lamp.InnerClass innerClass =  someObject.new InnerClass();

        for(Lamp lamp : lamps) {
            System.out.println(lamp);
        }

        Lamp lamp = new Lamp(152);
        lamp.setType(Lamp.Type.LED);    //обращение к статическому вложенному классу класса Lamp
        lamp.setBrightness(1);
        Lamp lamp2 = lamp.clone();
        lamp.toPrint();

        LightingDevice chandelier = new Chandelier(500,10);
        chandelier.toPrint();

        Printer printer = new SimplePrinter();
        printer.printBlackAndWhite();
        printer.printColor();

        /*TODO: пример интерфейса с анонимным классом
            без объявления имени класса на основе класса, абстрактного класса или интерфейса
         */
        TreeSet<LightingDevice> lightingDevices = new TreeSet<>(new Comparator<LightingDevice>() {
            @Override
            public int compare(LightingDevice o1, LightingDevice o2) {
                return Integer.compare(o1.getPower(), o2.getPower());
            }
        });

        //пример анонимного класса он располагается внутри фигурных скобок {}
        LightingDevice device = new LightingDevice(400) {
            @Override
            public double getEnergyConsumption() {
                return power * brightness;
            }

            /*TODO: Зачем нужны вложенные классы:
                -для построения логичной и аккуратной архитектуры
                    --(если класс используется только в каком то одном классе и более нигде то удобно разместить его внутри этого класса
                -для усиления инкапсуляции (есть два класса, и первому классу нужен доступ к переменным второго класса, причём переменные второго класса privet (доступ извне закрыт)
                -Для улучшения поддерживаемости, читабельности (такие вложенные классы располагаются рядом с кодом, которых их непосредственно использует).
             */
        };


    }
}