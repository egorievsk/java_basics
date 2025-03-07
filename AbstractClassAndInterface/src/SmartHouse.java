import java.util.ArrayList;

public class SmartHouse {

    private ArrayList<ElectricDevice> devices;

    public SmartHouse() {
        initLightingDevaces();
    }

    public void switchOffAllDevices() {
        for (ElectricDevice device : devices) {
            device.switchOff();
        }
    }

    public double getEnergyConsumption() {
        double sum = 0;
        for( ElectricDevice device : devices) {
            sum += device.getEnergyConsumption();
        }
        return sum;
    }

    public void switchOffAllLight() {
        for(ElectricDevice device : devices) {
            if(device instanceof LightingDevace) {
                device.switchOff();
            }
        }
    }

    private void initLightingDevaces() {
        devices.add(new Lamp(100));
        devices.add(new Lamp(60));
        devices.add(new Lamp(40));
        devices.add(new Chandelier(100, 4));
        devices.add(new Chandelier(400, 10));
        devices.add(new Chandelier(250, 5));
        devices.add(new Chandelier(120, 3));
    }

    static class localClass {

    }
}
