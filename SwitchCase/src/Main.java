import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 5;
        double h = 32435412;
        String j = "";
        long g = (long) 3546543212152432541.00;
        Object st = new ask(25);
        //st.po(16);
        Object rt = new ask("poi");
        Object ty = new ask(45,"dsikfhjg");
        System.out.println(formatString(st));
        System.out.println(formatString(25));
        System.out.println(formatString(25.89));
        System.out.println(formatString(203459899912666666687978979453686.89));

        do {
            i = i +5;

        } while (i == 10);
    }

    static String formatString(Object o) {
        String result = "";

        return switch (o) {
            case Integer i -> String.format("int %d", i);
            case Long d -> String.format("long %d", d);
            case Double f -> String.format("double %f", f);
            default -> o.toString();
        };

//        if (o instanceof  Integer) {
//            result = String.format("int %d", (Integer)o);
//        } else if (o instanceof String) {
//            result = String.format("String %s", (String)o);
//        }

        //return  result;
    }
}