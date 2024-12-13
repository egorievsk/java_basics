public class Figure {
    private final FigureColor color;
    private final FigureType type;

    public FigureColor getColor() {
        return color;
    }

    public FigureType getType() {
        return type;
    }

    public Figure(FigureColor color, FigureType type) {
        this.color = color;
        this.type = type;
    }

    public String toString() {
        return color.toString().substring(0,1) + type.toString().substring(0, 1);
    }




}
