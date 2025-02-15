import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Bascket {
    private TreeMap<Product, Integer> products; //объект Продукт, количество продукта

    public Bascket() {
        this.products = new TreeMap<>(new ProductComparator());
    }

    public void add(Product product, int count) {
        if (!products.containsKey(product)) {
            products.put(product, 0);
        }
        products.put(product, products.get(product) + count);
    }

    public void add(Product product) {
        add(product, 1);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        //варианты перебора
        //1:
        for(Product product : products.keySet()) {
            builder.append(product);
            builder.append(" - ");
            builder.append(products.get(product));
            builder.append("\n");
        }

        //2:
        for(Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
//            builder.append(product);
//            builder.append(" - ");
//            builder.append(products.get(product));
//            builder.append("\n");
        }
        return builder.toString();
    }
}
