public class ElectricBus extends Bus{
    private final double minimalTankFullnessRate;
    private static int count;

    public ElectricBus(double consumptionRate, double minimalTankFullnessRate) {
        super(consumptionRate);
        this.minimalTankFullnessRate = minimalTankFullnessRate;
        count++;
    }

    @Override
    public int powerReserve() {
        double remainingRate = getTankFullnessRate() - minimalTankFullnessRate;
        if(remainingRate <= 0) {
            return 0;
        }
        return (int) (remainingRate / getConsumptionRate());
    }

    public static int getCount() {
        return count;
    }
}
