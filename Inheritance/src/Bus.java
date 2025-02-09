public class Bus {

    public double getTankFullnessRate() {
        return tankFullnessRate;
    }

    public void setTankFullnessRate(double tankFullnessRate) {
        this.tankFullnessRate = tankFullnessRate;
    }

    private double tankFullnessRate; //rate of tank fullness, 0-1
    private final double consumptionRate; //rate (0-1) per 1km

    public double getConsumptionRate() {
        return consumptionRate;
    }

    public Bus(double consumptionRate) {
        this.consumptionRate = consumptionRate;
    }

    public boolean run(int distance) {
        if(powerReserve() <distance) {
            return false;
        }
        tankFullnessRate -= distance * consumptionRate;
        return true;
    }

    public  final void refuel(double tankRate) {
        double total = tankFullnessRate + tankRate;
        tankFullnessRate = total > 1 ? 1 : total;
    }

    public int powerReserve() {
        return (int) (tankFullnessRate / consumptionRate);
    }
}
