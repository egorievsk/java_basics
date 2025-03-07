public class Chandelier extends LightingDevace{

    private static final int LAMP_BRIGHTNESS_STEP = 2;
    private static final double CONSUMPTION_COEFF = 1.095;

    private final int lampsCount;

    //private Controller controler;

    public Chandelier(int power, int lampsCount) {
        super(power);
        this.lampsCount = lampsCount;
    }

    @Override
    public void setBrightness(double level) {
        double step = 1.0 / (lampsCount * LAMP_BRIGHTNESS_STEP);
        int stepsCount = (int) Math.round(level / step);
        super.setBrightness(stepsCount * step);
        //пример локального класса, для отделения внутренней логики
        //которая больше нигде не будет использоваться
        class Controller {
            public Controller() {
                 //connect
            }
            public void reset() {
                //some logic
            }
        }
        if (brightness == 0) {
           Controller controler = new Controller();
            controler.reset();
        }
    }

    @Override
    public double getEnergyConsumption() {
        return power * Math.pow(brightness, CONSUMPTION_COEFF);
    }
}
