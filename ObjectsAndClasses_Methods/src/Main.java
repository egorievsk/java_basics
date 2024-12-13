public class Main {

    public static void main(String[] args) {
        
        
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add("SSD Samsung EVO 980", 10250,78.0);
        basket.add("One print paper",5,0.568);
        basket.print("Basket 1");
        System.out.println("Вес всех товаров: " + basket.getTotalWeight());    

        Basket basket2 = new Basket(5000);
        basket2.add("teapot",7000,2000.0);
        basket2.add("Tea pack 100", 147,160.5);
        basket2.print("Basket 2");
        System.out.println("Вес всех товаров: " + basket2.getTotalWeight()); 
        
        Basket basket3 = new Basket("Нож столовый",504,204.5);
        basket3.print("basket3");
        System.out.println("Вес всех товаров: " + basket3.getTotalWeight());

        //Arithmetic arithmetic = new Arithmetic(595, 132);
        //System.out.println(arithmetic.summTwoNumbers());
        //System.out.println(arithmetic.multiplicationNumbers());
        //System.out.println(arithmetic.maximumFromTwoNumbers());
        //System.out.println(arithmetic.minimumFromTwoNumbers());

        
    }
}
