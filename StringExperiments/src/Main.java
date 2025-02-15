import org.w3c.dom.ls.LSOutput;

import java.io.ObjectStreamClass;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Задание 9.02.1

//        String withoutStringCase = "no";
//
//        String text1 = "", text2 = "";
//        for(int i = 1; i <=2; i++) {
//            String textLine = i == 1 ? "первую" : "вторую";
//            System.out.println("Введите " + textLine + " строку: ");
//            String text = new Scanner(System.in).next();
//            if (i == 1) {
//                text1 = text;
//            } else {
//                text2 = text;
//            }
//
//        }
//
//        System.out.println("Сравнить строки без учета регистра 'yes/no' ?");
//        withoutStringCase = new Scanner(System.in).next();
//
//        if (withoutStringCase.equalsIgnoreCase("yes")) {
//            if (text1.equalsIgnoreCase(text2)) {
//                System.out.println(text1 + " == " + text2);
//            } else {
//                System.out.println(text1 + " != " + text2);
//            }
//        } else {
//            if (text1.equals(text2)) {
//                System.out.println(text1 + " == " + text2);
//            } else {
//                System.out.println(tesxt1 + " != " + text2);
//            }
//        }

        //Задание 9.03.1
//        int number1 = 0;
//        int number2 = 0;
//        String operator = "";
//        for (int i = 1; i <= 3; i++) {
//            String expression = i == 1 || i == 3 ? "число": " оператор ";
//            System.out.println("Введите " + expression);
//            String text = new Scanner(System.in).nextLine();
//            if (i == 1) {
//                number1 = Integer.parseInt(text.trim());
//            } else if (i == 3) {
//                number2 = Integer.parseInt(text);
//            } else {
//                operator = text.trim();
//           }
//        }
//
//        String result = "";
//        switch (operator) {
//            case "+" -> result = number1 + " " + operator + " " + number2 + " = " + Integer.toString(number1 + number2);
//            case "-" -> result = number1 + " " + operator + " " + number2 + " = " + Integer.toString(number1 - number2);
//            case "*" -> result = number1 + " " + operator + " " + number2 + " = " + Integer.toString(number1 * number2);
//            case "/" -> result = number1 + " " + operator + " " + number2 + " = " + Integer.toString(number1 / number2);
//        }
//
//        System.out.println(result);

        //Задание 9.05.1
        String text41 = "Беллинсгаузен Васисуалий Никифорович";
        String text2 = "Андреев Дмитрий Иванович";
        String text = "Копылов Александр Сергеевич";
        int firstSpace = text.indexOf(" ");
        int secondSpace = text.lastIndexOf(" ");
        String lastName = text.substring(0,firstSpace);
        String firstName = text.substring(firstSpace + 1,secondSpace);
        String surname = text.substring(secondSpace + 1);

        String template = "Фамилия: %s \nИмя: %s \nОтчество: %s";
        String endText = String.format(template, lastName, firstName, surname);
        System.out.println(endText);

        //Задание 9.05.2
        //Задание 9.05.2
        String text1 = "7000 рублей заработал Иван, Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        int sum = 0;
        int spacePosition = text1.indexOf(" ");
        String employePay = "";
        StringBuilder stringBuilder = new StringBuilder(",");
        while (spacePosition > 0) {
            int beginingSpace = spacePosition;

            spacePosition = text1.indexOf(" ",spacePosition + 1);
            String positionText = text1.substring(beginingSpace, spacePosition == -1 ? text1.length() : spacePosition);
            if(Character.isDigit(positionText.charAt(1))) {
                sum = sum + Integer.parseInt(positionText.strip());
            }
        }

        System.out.println(sum);


    }



//    public static String textDigits(String text) {
//        try {return Integer.getInteger(text)}
//        catch (Exception e) {
//            throw new RuntimeException(e);
//        }

}
