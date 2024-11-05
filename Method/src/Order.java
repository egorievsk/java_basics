public class Order {
    private int count = 0;
    private int totalCost = 0;

    public void addProduct(int productCount, int cost) {
        count = count + productCount;
        totalCost = totalCost + cost;
    }

    public int getProductCount() {
        return count;
    }

    public int getTotalCost() {
        return totalCost;
    }
}
