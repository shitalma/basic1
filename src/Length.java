public class Length extends Measurement{
    private double length;
    private Unit.Length unit;

    public Length(double length, Unit.Length unit) throws IllegalArgumentException {
        if (length < 0) throw new IllegalArgumentException("Length is negative");
        this.length = length;
        this.unit = unit;
    }

    public double getLength() {
        return this.length;
    }

    public Unit.Length getUnit() {
        return this.unit;
    }

    public Length convertTo(Unit.Length other) {
        return new Length((Math.round(this.getUnit().getUnitValue() / other.getUnitValue() * this.length)), other);
    }
}