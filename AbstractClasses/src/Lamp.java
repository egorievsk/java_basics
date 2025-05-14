import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public class Lamp extends LightingDevice implements Cloneable, Serializable {

    private Type type;

    /*это внутренний класс, но обычно они приватные,
    но если он публичный,
    то логичнее сделать его снаружи в виде отдельного класса
     */
    public class InnerClass {};

    //пример статического вложенного класса
    public enum Type {
        INCANDESCENT,
        FILAMENT,
        LED,
        LUMINESCENT
    }

    public Lamp(int power) {
        super(power);
    }

    @Override
    public double getEnergyConsumption() {
        return power * brightness;
    }

    @Override
    protected Lamp clone() throws CloneNotSupportedException {
        return new Lamp(power);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    private void writeObject() throws IOException {

    }


}
