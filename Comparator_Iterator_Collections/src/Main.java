import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //12.2 Выбор подходящей коллекции
        /*TODO: Начало выбора:
           нужен ли простой список, список уникальных элементов ли список ключей и значений
           важен ли порядок: порядок добавления, сортировка или порядок не важен
           многопоточность.

         */

        //12.3 Преобразование массивов и коллекций
        //перебором эелементов или одним действием

        //перебор
        String[] colors = {"Красный","Синий","Зеленый","Жёлтый"};
        ArrayList<String> colorsList = new ArrayList<>();
        //ArrayList<String> colorsList = new ArrayList<>(Arrays.asList(colors));
//        for(String color : colors) {
//            colorsList.add(color);
//        }

        //одно действие
        colorsList.addAll(Arrays.asList(colors));

        String[] newColors = new String[colorsList.size()];
        for(int i = 0; i < newColors.length; i++) {
            newColors[i] = colorsList.get(i);
        }

        //для HashSet, TreeMap
        HashSet<String> colorsSet = new HashSet<>(colorsList);
        TreeSet<String> colorsTreeSet = new TreeSet<>(new ColorComparator());
        colorsTreeSet.addAll(colorsSet);

        System.out.println(Arrays.toString(newColors));

        HashMap<String,Integer> basket = new HashMap<>();
        basket.put("Молоко", 20);
        basket.put("Масло", 10);
        basket.put("Хлеб",5);

        TreeMap<String, Integer> basketMap = new TreeMap<>(new ProductComparator());
        basketMap.putAll(basket);

        for(String product : basketMap.keySet()) {
            System.out.println(product + " - " + basketMap.get(product));
        }

        for (Integer count : basketMap.values()) {
            System.out.println(count);
        }

        for (Map.Entry<String, Integer> e : basketMap.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }

        /*TODO: методы
            Arrays.asList();
            toArray();
            addAll(...);
            Конструктор new ArrayList<>(Arrays.asList(new String[5])
            putAll(...);
            keySet();
            values();
            entrySet();
         */

        //12.4 Итератор
        //если в процессе перебора циклом for удалять эелемнты то цикл сломается.
        //Iterator помогает этого избежать
        ArrayList<String> colors1 = new ArrayList<>();
        colors1.add("Красный");
        colors1.add("Зелёный");
        colors1.add("Синий");
        colors1.add("Жёлтый");
        Iterator<String> iterator = colors1.iterator();
        while(iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
            if(color.equals("Зелёный")) {
                iterator.remove();
            }
        }

        System.out.println("Итого:");
        for(String color : colors1) {
            System.out.println(color);
        }

        System.out.println(System.lineSeparator());

        //12.5 Класс Collections
        //предоставляет методы по работе с коллекциями
        Game game = new Game();
        game.initPlayers();
//        ArrayList<String> winners = game.getWinners();
//        for(String winner : winners) {
//            System.out.println(winner);
//        }
        System.out.println(System.lineSeparator());

        game.add("Андрей Дмитриев");










    }
}