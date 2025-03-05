
public class Lamp extends LightingDevace {

    public Lamp(int power) {
        super(power);
    }

    @Override
    public double getEnergyConsumption() {
        return power * brightness;
    }
}
