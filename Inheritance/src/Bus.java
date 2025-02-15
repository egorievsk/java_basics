import java.util.Objects;

public class Bus {

    private double tankFullnessRate; //rate of tank fullness, 0-1
    protected double consumptionRate; //rate (0-1) per 1km

    private static int count;

    public Bus(double consumptionRate) {
        this.consumptionRate = consumptionRate;
        count++;
    }

    public double getTankFullnessRate() {
        return tankFullnessRate;
    }

    public void setTankFullnessRate(double tankFullnessRate) {
        this.tankFullnessRate = tankFullnessRate;
    }

    public double getConsumptionRate() {
        return consumptionRate;
    }

    public boolean run(int distance) {
        if(powerReserve() < distance) {
            return false;
        }
        tankFullnessRate -= distance * consumptionRate;
        return true;
    }

    public void refuel(double tankRate) {
        double total = tankFullnessRate + tankRate;
        tankFullnessRate = total > 1 ? 1 : total;
    }

    int powerReserve() {
        return (int) (tankFullnessRate / consumptionRate);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus bus)) return false;
        return Double.compare(tankFullnessRate, bus.tankFullnessRate) == 0 && Double.compare(consumptionRate, bus.consumptionRate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tankFullnessRate, consumptionRate);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "tankFullnessRate=" + tankFullnessRate +
                ", consumptionRate=" + consumptionRate +
                '}';
    }
}
