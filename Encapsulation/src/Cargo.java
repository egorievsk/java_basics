import java.util.SplittableRandom;

public class Cargo {
    private final String deliveryAddress;
    private final String registrationNumber;
    private final boolean canTurnOver;
    private final boolean cargoFragile;
    private final double weight;

    private final Dimensions dimensions;

    public Cargo(String deliveryAddress, String registrationNumber, boolean canTurnOver, boolean cargoFragile, double weight, Dimensions dimensions) {
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.canTurnOver = canTurnOver;
        this.registrationNumber = registrationNumber;
        this.cargoFragile = cargoFragile;
        this.dimensions = dimensions;
    }

    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(deliveryAddress,registrationNumber,canTurnOver,cargoFragile,weight,dimensions);
    }

    public Cargo setRegistrationNumber(String registrationNumber) {
        return new Cargo(deliveryAddress,registrationNumber,canTurnOver,cargoFragile,weight,dimensions);
    }

    public Cargo setCanTurnOver(boolean canTurnOver) {
        return new Cargo(deliveryAddress,registrationNumber,canTurnOver,cargoFragile,weight,dimensions);
    }

    public Cargo setCargoFragile(boolean cargoFragile) {
        return new Cargo(deliveryAddress,registrationNumber,canTurnOver,cargoFragile,weight,dimensions);
    }

    public Cargo setWeight(double weight) {
        return new Cargo(deliveryAddress,registrationNumber,canTurnOver,cargoFragile,weight,dimensions);
    }

    public Cargo setdimensions(Dimensions dimensions) {
        return new Cargo(deliveryAddress,registrationNumber,canTurnOver,cargoFragile,weight,dimensions);
    }

    public String toString() {
        return "Delivery address: " + deliveryAddress + "\n" +
                "Registration number: " + registrationNumber + "\n" +
                "Can turn over - " + canTurnOver + "\n" +
                "Cargo fragile - " + cargoFragile + "\n" +
                "weight: " + weight + "\n" +
                "Dimensions: " + dimensions;
    }

}
