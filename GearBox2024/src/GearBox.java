public class GearBox {
    /**
     * 0 - neutral
     * -1 - rear
     * 1-6
     */
    //TODO: константа класса это static final и обозначаются большими буквами в нижним подчеркиванием между слов
    //        она может быть и видимой то есть public, но окажется публичной  неизменяемой и принадлежащей классу, а не объекту класса

    private int gear = 0;   //TODO: приватная переменная доступна только в самом объекте и изменяемая в самом объекте, доступная для всех методов этого класса
    public static final int MAX_GEAR = 6;   //TODO: публичная статическая и финализируемая переменная доступная за пределами класса, является неизменяемой и статическоцй, то есть константой. Имена таких переменных обозначаются большими буквами с нижним подчёркиванием между словами
    public static final int MIN_GEAR = 1;

    public final GearBoxType type;

    public GearBox(GearBoxType type) {
        this.type = type;
    }

    public GearBoxType getType() {
        return type;
    }
    public void shiftUp() {
        gear = gear < MAX_GEAR ? gear + 1: gear;
    }

    public void shiftDown() {
        gear = gear < MIN_GEAR ? gear - 1 : gear;
    }

    public void switchRear() {
        gear =  (gear > 1) ? gear : - 1;
    }

    public void switchNeutral() {
        gear = 0;
    }

    public int getCurrentGear() {
        return gear;
    }
}
