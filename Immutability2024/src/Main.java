public class Main {
    public static void main(String[] args) {
        Product product = new Product("Table",1500,"46061163260");
        System.out.println(product.getPrice());
        product.setPrice(2600);
        System.out.println(product.getPrice());
    }
}