import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //***
        Elevator elevator = new Elevator(-3,26);
        int num = 0;
        while (num < 5) {
            System.out.println("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
            num = num + 1;
        }

        //
        Dimensions dimensions = new Dimensions(0.398, 0.639, 0.5);
        Cargo cargo = new Cargo("Moscow city, Tverskaya boulevard, 6","589544",false,true,56.9,dimensions);
        System.out.println(cargo);

        Cargo cargo1 = cargo.setWeight(3.05);
        System.out.println(cargo1);

        Dimensions dimensions1 = dimensions.setheight(1.152);
        Cargo cargo2 = cargo.setdimensions(dimensions1);
        System.out.println(cargo2);
    }
}