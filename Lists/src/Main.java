import java.awt.image.Raster;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //СПИСКИ - вариант коллекции
        //возможность удалять и добавлять элементы. В массивах этого делать нельзя.
        //скорость работы списка меньше и занимают больше памяти

        ArrayList arrayList = new ArrayList<>();
        arrayList.add(35);
        arrayList.add("35");

        int certCount = 1000;
        int winnerRate = 100;
        int[] certNums = new int[certCount];
        ArrayList<Integer> winnerCerts = new ArrayList<>();
       // boolean[] certIsWin = new boolean[certCount];
        for (int i = 0; i < certNums.length; i++) {
            certNums[i] = 1_000_000 + (int) Math.round(8_999_999 * Math.random());
            if (i % winnerRate == 0) {
                winnerCerts.add(certNums[i]);
            }
            //certIsWin[i] = i % winnerRate == 0;
        }
        System.out.println(winnerCerts.get(5));

        for (int i = 0; i < winnerCerts.size(); i++) {
            System.out.println(winnerCerts.get(i));
        }

        //другой вариант перебора списка
        for (Integer winnerNumber : winnerCerts) {
            System.out.println(winnerNumber);
        }

        //другой пример
        //программа списка дел
        ArrayList<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Купить молоко", "5 пакетов"));
        taskList.add((new Task("Покормить кота", "новым кормом")));
        taskList.add(new Task("Сжечь секретное", "Особенно из синей сумки!"));

        taskList.add(0, new Task("Очень срочная задача", "")); //добавление элемента с нужным индексом (порядком)
        taskList.remove(2); //удаление элемента с нужным индексом

        taskList.set(1, new Task("Покормить лошадь", "новым кормом")); //замена элемента с индексом на другой

        for (Task task : taskList) {
            System.out.println(task);
        }

        //преобразование списка в массив
        Integer[] numbers = {10 , 20, 45, 99};
        ArrayList<Integer> values = new ArrayList<>();
        values.addAll(Arrays.asList(numbers));

        Integer[] nums = values.toArray(new Integer[0]);   //Обратное преобразование массива в список

        for (Integer value : values) {
            System.out.println(value);
        }

        System.out.println(Arrays.toString(nums));

        //упрощенное добавление в список
        ArrayList<String> list = new ArrayList<>() {
            {add("First");
            add("Second");
            add("Thirty");}
        };

        ArrayList<String> listSimple = new ArrayList();
        listSimple.add("Method");
        listSimple.add("Element");
        for(Object elementList : listSimple) {
            System.out.println(elementList);
        }

        String[] newString = listSimple.toArray(new String[0]);

        Integer[] newArray = {54, 88, 1};
        ArrayList<Integer> asList = new ArrayList<>();
        asList.addAll(Arrays.asList(newArray));
        asList.set(1,99);

        for (Integer listEl : asList) {
            System.out.println(listEl);
        }

        ArrayList<Float> listFloat = new ArrayList() {
            {
                add(2.54f);
                add(8.55f);
                add(9.99f);
            }
        };
        for (Float floatEl : listFloat) {
            System.out.println(floatEl);
        }

        int[][] intArray = new int[10][];

        // TODO: написать консольное приложение для работы со списком дел todoList






    }
}