public class Engine {
    public final EngineType engineType;
    public final double volume;
    public final int power;

    Engine(EngineType engineType, double volume, int power) {
        this.engineType = engineType;
        this.volume = volume;
        this.power = power;
    }
    public int getPower() {return power;}
    public double getVolume() {return volume;}
    public EngineType getEngineType() {return engineType;}
}
