import com.sun.source.tree.Tree;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.io.ByteArrayInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //12.2 Выбор подходящей коллекции
        /*TODO: какую задачу нужно решать:
            -какая коллекция нужна с ключами, с уникальными значениями
            -определяется нужна ли нам сортировка,
            -потокобезопасная ли коллекция.
         */
        //преобразования перебором или преобразованием одним действием

        //перебор
//        String[] colors = {"Красный","Синий", "Зеленый", "Желтый"};
//        ArrayList<String> colorsList = new ArrayList<>(Arrays.asList(colors));
////        for(String color : colors) {
////            colorsList.add(color);
////        }
//
//        //colorsList.addAll(Arrays.asList(colors));
//
//        String[] newColors = new String[colorsList.size()];
//        for (int i = 0; i < newColors.length; i++) {
//            newColors[i] = colorsList.get(i);
//        }
//
//        HashSet<String> colorsSet = new HashSet<>(colorsList);
//        TreeSet<String> colorsTreeSet = new TreeSet<>(new ColorComparator());
//        colorsTreeSet.addAll(colorsSet);
//
//        System.out.println(Arrays.toString(newColors));

        HashMap<String,Integer> basket = new HashMap<>();
        basket.put("Молоко", 20);
        basket.put("Масло", 10);
        basket.put("Хлеб", 5);

        TreeMap<String,Integer>basketMap = new TreeMap<>(new ProductComparator());
        basketMap.putAll(basket);

        for(Map.Entry d : basketMap.entrySet() ) {
            System.out.println(d.getKey() + " - " + d.getValue());
        }




    }
}