import java.sql.SQLOutput;
import java.util.EnumMap;

public class Employee {
    private String name;
    private String email = "не задан";
    private int telefone;

    Employee () {
        this.email = email;
    }

    Employee (String name, String email, int telefone) {
        this.name = name;
        this.email = email;
        this.telefone = telefone;
    }

    Employee (String name, String email) {
        this.name = name;
        this.email = email;
    }

    Employee (String name, int telefone) {
        //this();
        this.name = name;
        this.telefone = telefone;
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("E-mail: " + email);
        System.out.println("Телефон:" + telefone);
    }
}
