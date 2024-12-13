public class Main {
    public static void main(String[] args) {
        Product product = new Product("Balls",476);
        Product prodict1 = new Product("Windows",15789);
        Product prodict2 = new Product("Wheels",87923);
        System.out.println(Product.getAveragePrice());
        System.out.println(Product.count);
        System.out.println(Product.totalPrice);
    }
}