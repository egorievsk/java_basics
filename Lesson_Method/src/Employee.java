import java.util.concurrent.TimeoutException;

public class Employee {
    private String name;
    private String email = "не задан";
    private int telefon;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public Employee(String name, int telefon) {
        this.name = name;
        this.telefon = telefon;
    }
    public Employee(String name, String email, int telefon) {
        this.name = name;
        this.email = email;
        this.telefon = telefon;
    }

    public void printInfo() {
        System.out.println("Имя: " + name + "\n" + "E-mail:" + email + "\n" + "Телефон: " + telefon);
    }
}
