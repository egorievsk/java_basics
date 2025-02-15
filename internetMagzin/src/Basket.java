public class Basket {

    private  static String items = "";

    Basket(String items) {
        items = "hello";
    }
    public static void main(String[] args) {

    }
    public static void add(String name, int price) {
        items = items + "\n" + name + " - " + price;
    }

    public static void clear() {
        items = "";
    }

    public static  void print(String title) {
        System.out.println(title);

    }

}
