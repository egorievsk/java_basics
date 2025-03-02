public abstract class LightingDevace {
    public static final double MAX_BRIGHTNESS = 1D;
    public static final double MIN_BRIGHTNESS = 0D;

    protected final int power;
    protected double brightness;

    public LightingDevace(int power) {
        this.power = power;
    }

    public void setBrightness(double level) {
        if (level < MIN_BRIGHTNESS) {
            brightness = MIN_BRIGHTNESS;
        } else if (level > MAX_BRIGHTNESS) {
            brightness = MAX_BRIGHTNESS;
        } else {
            brightness = brightness;
        }
    }

    public double getBrightness() {
        return brightness;
    }

    public void changeBrightenss(double rate) {
        double changed = brightness + brightness * rate;
        setBrightness(changed);
    }

    public abstract double getEnergyConsumption();
}
