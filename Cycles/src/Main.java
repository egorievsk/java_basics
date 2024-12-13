import org.w3c.dom.ls.LSOutput;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       while (true) {
           System.out.println("Введите сообщение:");
           String input = new Scanner(System.in).nextLine();

//           if (input.equals("Привет")) {
//               System.out.println("Привет!");
//           } else if (input.equals("Как дела?")) {
//               System.out.println("Отлично! У тебя как?");
//           } else {
//               System.out.println("Не понимаю сообщение :(");
//           }
           switch (input) {
               case "Привет!" -> {
                   System.out.println("Привет!");
                   System.out.println("Меня зовут Саша!");
               }
               case "Как дела?" -> System.out.println("Отлично! У тебя как?");
               default -> System.out.println("Не понимаю сообщение :(");
           }
       }
    }
}