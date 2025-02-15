
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Employee employee1 = new Employee("Александр Сергеевич Копылов",2044041);
//        employee1.printInfo();
//        Employee daniil = new Employee("Даниил Денисович Истранин","iidd58526@gmail.com",8910197);
//        daniil.printInfo();

        Printer printer = new Printer();
        printer.append("some text 133", "Справка");
       printer.append("some text 210", 544);
        System.out.println(printer.getPendingPagesCount());
        printer.print();
        printer.append("some text 8", 530);
        printer.clear();
        printer.append("some text 23", "Договор", 312);
        printer.append("some text 11");
        printer.print();
        System.out.println(printer.getPrintedCount());
    }


}