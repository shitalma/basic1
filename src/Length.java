public class Length extends Measurement{
    public Length(double length, LengthUnit unit) throws IllegalArgumentException {
        super(length,unit);
    }

    public Length convertTo(LengthUnit other) {
        Measurement measurement = super.convertTo(other);
        return new Length(measurement.getQuantity(), other);
    }

    public Length addTo(Length length) {
        Measurement measurement = super.addTo(length);
        return new Length(measurement.getQuantity(), (LengthUnit) measurement.getUnit());
    }
}