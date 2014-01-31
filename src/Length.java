public class Length {
    private double length;
    private Unit unit;

    public Length(double length, Unit unit) throws IllegalArgumentException {
        if (length < 0) throw new IllegalArgumentException("Number is negative");
        this.length = length;
        this.unit = unit;
    }

    public double getLength() {
        return this.length;
    }

    public Unit getUnit() {
        return this.unit;
    }

    @Override
    public boolean equals(Object o) {
        return (null != o && this.getClass() == o.getClass());
    }

    public Length convertTo(Unit other) {
        return new Length((this.getUnit().getUnitValue() / other.getUnitValue() * this.length), other);
    }
}