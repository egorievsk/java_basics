public class Order {
    public void  addProduct(Product product) {
        //adds copy products
        Product copy = new Product(product.getName(), product.getPrice());
    }
}
