public class Length extends Measurement{
    public Length(double length, LengthUnit unit) throws IllegalArgumentException {
        super(length,unit);
    }

    public Length convertTo(LengthUnit other) {
        return new Length(this.getUnit().getUnitValue() / other.getUnitValue() * this.getQuantity(), other);
    }
    public Length addTo(Length length) {
        if(this.convertTo(length.getUnit()).getQuantity() > length.getQuantity()) {
            return new Length(this.getQuantity() + length.convertTo(this.getUnit()).getQuantity(), (LengthUnit) this.getUnit());
        }
        return new Length(this.convertTo(length.getUnit()).getQuantity() + length.getQuantity(), (LengthUnit) length.getUnit());
    }
}