import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {5, 25, 96, 23, 56};

        for( int i : intArray) {
            System.out.println((i));
        }
        System.out.println(intArray.toString());

        ArrayList<Integer> arrayList = new ArrayList<>() {
            {add(1);
            add(2);
            add(3);
            }
        };
        arrayList.add(5);
        ArrayList<String> copyList = new ArrayList<>();

        ArrayList<Integer> copyarraylist = new ArrayList<>();
        copyarraylist.addAll(Arrays.asList());

        String[] testStr = new String[4];
        testStr[0] = "1";
        testStr[1] = "2";

        Integer[] numbers = {5,10,25};
        ArrayList<Integer> strArray = new ArrayList<>();
        strArray.addAll(Arrays.asList(numbers));

        System.out.println(strArray);

        Integer[] copyNumbers = new Integer[strArray.size()];
        strArray.toArray(copyNumbers);
        Comparator comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        strArray.sort(comparator.reversed());
        System.out.println(strArray);

        HashSet<Integer> hashSet = new HashSet<>(arrayList);
        System.out.println(hashSet);

        TreeSet<Integer> treSet = new TreeSet<>(arrayList);
        System.out.println(treSet);
        List<Integer> list = new LinkedList<>(treSet);
        System.out.println(list);
        System.out.println(treSet.contains(10));
        System.out.println(treSet.floor(2));
        treSet.forEach(c -> System.out.println(c));
    }
}