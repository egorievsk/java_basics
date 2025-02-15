import java.util.PrimitiveIterator;

public class Order {
    private int count = 0;
    private int totalCost = 0;

    public int getPrtoductCount() {
        return count;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void addProduct(int productCount, int cost) {
        count = count + productCount;
        totalCost = totalCost + cost;
    }
}
