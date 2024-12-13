public class Car {
    public final Engine engine;
    public final CarType carType;
    public final int weigth;

    Car(Engine engine, CarType carType, int weight) {
        this.carType = carType;
        this.engine = engine;
        this.weigth = weight;
    }

    public CarType getCarType() {return carType;}
    public Engine getEngine() {return engine;}
    public int getWeigth() {return weigth;}
}
