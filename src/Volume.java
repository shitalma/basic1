public class Volume extends Lib{
    private double volume;
    private Unit unit;

    public Volume(double length, Unit unit) throws IllegalArgumentException {
        if (length < 0) throw new IllegalArgumentException("Number is negative");
        this.volume = length;
        this.unit = unit;
    }

    public double getLength() {
        return this.volume;
    }

    public Unit getUnit() {
        return this.unit;
    }

}
