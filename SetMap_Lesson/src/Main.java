import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    public static void main(String[] args) {

        /*TODO: Основные представители класса Set:
             Основные представители класса Set (хранят только уникальные элементы)
               -HashSet
               -TreeSet (сортированный порядок элементов)
               -LinkedHashSet (сохраняется порядок добавления)
               -EnumSet (хранит только enum классы)
        */

        Client john = new Client("John", 1);
        Client sandra = new Client("Sandra", 2);

        List<Client> clients = List.of(john, sandra, sandra, sandra);

        System.out.println("Size of list: " + clients.size());

        HashSet<Client> hashSet = new HashSet<>(clients);

        System.out.println(hashSet.size());

        hashSet.forEach(c -> System.out.println(c));


        List<String> list2 = new ArrayList<>();


        for (int i = 0; i < 50000; i++) {
            list2.add(String.valueOf(i));
        }

        Set<String> set =  new HashSet<>(list2);

        System.out.println(list2.size());
        System.out.println(set.size());
        /* TODO: Механизм добавления элемента:
            вычисление позиции ячейки в hashSet.map.table
            96750 >>> 16 = 1
            96750 ^ 1 (XOR - исключающее или) = 96751
            15 & (побитовый оператор AND) 96751 = 15
            int shiftUnsign = key.hashCode() >>> 16;
            int hash = key.hashCode() ^ shiftUnsign;
            int index = (16 - 1) & hash
         */

        //Client cloneSandra = new Client("Sandra", 2);
//        hashSet.add(sandra);
//        hashSet.add(john);
        //hashSet.add(cloneSandra);
//
//        for(Client client : hashSet) {
//            System.out.println(client.getName() + " -> " + client.hashCode());
//        }

//        for(int i = 0; i < 500; i++) {
//            hashSet.add(new Client("John Doe", i));
//        }


        System.out.printf("hash %04d -> equals %04d%n", Client.hashCodeCount, Client.equalsCount);
        System.out.println(hashSet.size());
        System.out.println(System.lineSeparator());

        //TreeSet и сортировка

        Set<Client> clients1 = new TreeSet<>();
        clients1.add(new Client("Sandra", 1));
        clients1.add(new Client("Alex", 3));
        clients1.add(new Client("John", 2));
        clients1.forEach(c -> System.out.println(c.getName()));

        Set<Client> setAlphabetOrder = new TreeSet<>(new ClientComparator().reversed());
        setAlphabetOrder.addAll(clients1);

        setAlphabetOrder.forEach(c -> System.out.println(c.getName()));

    }
}

class Client implements Comparable<Client>{

    static int hashCodeCount;
    static int equalsCount;
    private final String name;
    private final int id;

    @Override
    public int compareTo(Client o) {
        return Integer.compare(id,o.id);
    }

    @Override
    public boolean equals(Object o) {
        equalsCount++;
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return id == client.id && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        hashCodeCount++;
        return Objects.hash(name, id);
        //return id;
    }

    public Client(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}