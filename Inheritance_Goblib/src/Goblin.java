public class Goblin implements Cloneable{

    public void getMessage() {
        System.out.println("This is class Goblin");
    }

    public Object clone() throws CloneNotSupportedException{
       Object goblin = (Goblin) super.clone();
       return goblin;
    }
}
