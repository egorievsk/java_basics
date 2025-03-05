public class Fan implements ElectricDevice {
    @Override
    public boolean isSwitchedOn() {
        return false;
    }

    @Override
    public void switchOn() {

    }

    @Override
    public void switchOff() {

    }

    @Override
    public double getEnergyConsumption() {
        return 0;
    }
}
