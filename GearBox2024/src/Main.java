public class Main {
    public static void main(String[] args) {
        GearBoxType type = GearBoxType.valueOf("ROBOT");
        GearBox gearBox = new GearBox(type);
        System.out.println(GearBox.MAX_GEAR);

        System.out.println(gearBox.getType());    }
}