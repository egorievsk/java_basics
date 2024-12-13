public class Employee {

    public int value;  
    public String name;


    public Employee(int value) {
        this.name = "По умолчанию";
        this.value = value;
    }

    public Employee(int value, String name) {
        this.name = name;
        this.value = value;
    }

    public void printValue(String title) {
        System.out.println(title + "\n" + "name: " + name + " - " + value);
    }
}