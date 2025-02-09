public class ElectricBus  extends Bus{
    private final double minimalTankFullnessRate;

    public ElectricBus(double consumptionRate, double minimalTankFullnessRate) {
        super(consumptionRate);
        this.minimalTankFullnessRate = minimalTankFullnessRate;
    }


}
