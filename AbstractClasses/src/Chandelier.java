
public class Chandelier extends LightingDevice{

    private static final int LAMP_BRIGHTNESS_STEPS = 2;
    private static final double CONSUPTION_COEFF = 1.095;

    private final int lampsCount;

    private Controller controller;

    //такой класс нужен для отделения логики процесса от остальной логики класса
    //и нигде больше не будет использоваться
    private class Controller {
        public void reset() {
            //some logic
        }
    }

    public Chandelier(int power, int lampsCount) {
        super(power);
        this.lampsCount = lampsCount;
        controller = new Controller();
    }

    @Override
    public void setBrightness(double level) {
        double step = 1.0 / (lampsCount * LAMP_BRIGHTNESS_STEPS);
        int stepsCount = (int) Math.round(level / step);
        super.setBrightness(stepsCount * step);
        if (brightness == 0) {
            controller.reset();
        }

        class Control {

            //пример локальный класс для использования внутри конкретного метода
            public Control() {
                //connect
            }

            public void resetC() {
                //some logic
            }

        }
    }

    @Override
    public double getEnergyConsumption() {
        return power * Math.pow(brightness, CONSUPTION_COEFF);
    }
}
