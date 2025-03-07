
public class Lamp extends LightingDevace {

    private Type type;

    //нестатический вложенный класс типа enum
    public enum Type{
        //лампа накаливания
        INCANDESCENT,
        //филаментная лампа
        FILAMENT,
        //светодиодная лампа
        LED,
        //люминесцентнавя лампа
        LUMINESCENT
    }
    public Lamp(int power) {
        super(power);
    }

    @Override
    public double getEnergyConsumption() {
        return power * brightness;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
