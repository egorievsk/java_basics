public interface ElectricDevice {

    boolean isSwitchedOn();

    void switchOff();

    void switchOn();

    double getEnergyConsumption();

    default void toggle() {
        if (isSwitchedOn()) {
            switchOff();
        } else {
            switchOn();
        }
    }

    default void toPrint() {
        System.out.println("This is " + getClass());
    }

}
