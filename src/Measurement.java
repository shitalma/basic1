public class Measurement {
    private double quantity;
    private Unit unit;

    public Measurement(double quantity, Unit unit) {
        if (quantity < 0) throw new IllegalArgumentException("Quantity is negative");
        this.quantity = quantity;
        this.unit = unit;
    }
    public double getQuantity() {
        return this.quantity;
    }

    public Unit getUnit() {
        return this.unit;
    }

    public Measurement convertTo(Unit other){
        double value =(this.getUnit().getUnitValue() / other.getUnitValue()) * this.quantity;
        return new Measurement(value, other);
    }

    public Measurement addTo(Measurement measurement) {
        if(this.convertTo(measurement.getUnit()).getQuantity() > measurement.getQuantity())
            return new Measurement(this.getQuantity() + measurement.convertTo(this.getUnit()).getQuantity(), this.getUnit());
        return new Measurement(this.convertTo(measurement.getUnit()).getQuantity() + measurement.getQuantity(),measurement.getUnit());
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Measurement)) return false;
        Measurement measurement = (Measurement) o;

        Measurement otherUnit = measurement.convertTo(this.getUnit());
        Measurement thisUnit = this.convertTo(this.getUnit());

        return Double.compare(thisUnit.getQuantity(),
               otherUnit.getQuantity()) == 0; }
}