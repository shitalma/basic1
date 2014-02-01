public class Length extends Measurement{
    public Length(double length, LengthUnit unit) throws IllegalArgumentException {
        super(length,unit);
    }

    public Length convertTo(LengthUnit other) {
        return new Length(this.getUnit().getUnitValue() / other.getUnitValue() * this.getQuantity(), other);
    }
}