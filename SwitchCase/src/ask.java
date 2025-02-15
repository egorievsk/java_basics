public class ask {

    int o;

    String b;

    ask() {
    }

    ask(int o) {
        this.o = o;
    }

    ask(String b) {
        this.b = b;
    }

    ask(int o, String b) {
        this.o = o;
        this.b = b;
    }

    public String returnData() {
        return o + "-" + b;
    }

    public void po (int o) {
        int y;
        y = o * 2;
        System.out.println(y);
    }

}
