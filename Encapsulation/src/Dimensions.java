public class Dimensions {
    private final double height;    // meter
    private final double length;    //meter
    private final double width;     //meter

    public Dimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Dimensions setLength(double length) {
        return new Dimensions(length, width, height);
    }

    public Dimensions setwidth(double width) {
        return new Dimensions(length, width, height);
    }

    public Dimensions setheight(double height) {
        return new Dimensions(length, width, height);
    }

    public String toString() {
        return "length - " + length + ", width - " + width + ", height - " + height + ", volume: " + width * height * length;
    }
}
