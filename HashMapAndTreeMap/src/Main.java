
import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //HashMap и TeeMap
        //TODO: В HashMap ключ может быть равен null
        //а в TreeMap ключ не может быть равен null
        HashMap<String, Car> cars = new HashMap<>();
        cars.put("A765MT77", new Car("A765MT77"));
        cars.put("E637DD97", new Car("E637DD97"));
        cars.put("V789KX77", new Car("V789KX77"));
        cars.put("T372MH199", new Car("T372MH199"));
            //заменяется значение, если ключ тот же
        cars.put("E637DD97", new Car("M907DD83"));

        System.out.println(cars.get("E637DD97"));

        Bascket bascket = new Bascket();
        bascket.add(new Product("Хлеб", 50), 10);
        bascket.add(new Product("Молоко", 75), 20);
        bascket.add(new Product("Масло", 150), 10);
        bascket.add(new Product("Молоко", 75), 30);
        System.out.println(bascket);

        HashMap<String, String> map = new HashMap<>();
        map.put(null, "564");
        map.put("564","45try");
        System.out.println(map.get(null));
        Collection collection = map.values(); // возвращает коллекцию
        System.out.println(collection);
        Set entrySet = map.entrySet();  //Возвращает наборы запись (ключ + значение)
        System.out.println("entrySet " + entrySet);
        Set keySet = map.keySet();  //возвращает набор
        System.out.println("keySet " + keySet);

        //TODO: методы классов HashMap, TreeSet
        /*
        put(K - key, V - value),
        get(K),
        remove(K)
        clear()
        containsKey(K),
        containsValue(Object),
        keySet() - получить набор ключей
        entrySet() - получить набор пар ключ + значение
        values() - набор значений (как массив)
        isEmpty()
         */

        //TreeMap
        //ключи хранятся в виде дерева
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("Kopylov", "Alexandr");
        treeMap.put("Istranin", "Daniil");
        String set = treeMap.get("Kopylov");
        System.out.println(set);

        treeMap.remove("Istranin");
        treeMap.size();
        //treeMap.clear();
        treeMap.pollFirstEntry(); //вытащить первую пару ключа и значения и вернуть её
        treeMap.pollLastEntry();
        treeMap.floorKey("Kopyl");
        treeMap.ceilingKey("Kopy"); //возвращает похожие или близко к похожему наборы
        treeMap.entrySet();


        TreeMap<Long, String> mapTree = new TreeMap<Long, String>();
        mapTree.put(79262044041L,"Alex");
        mapTree.put(79258910197L, "Daniil");
        mapTree.put(79165955693L, "Dima");

        for(Map.Entry<Long, String>c : mapTree.entrySet()) {
            System.out.println(c);

        }
        for(Long number : mapTree.keySet()) {
            System.out.println(mapTree.get(number));
        }



    }
}