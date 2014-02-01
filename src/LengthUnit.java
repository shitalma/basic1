public enum LengthUnit implements Unit {
    CENTIMETER(0.01),
    METER(1),
    MILLIMETER(0.001),
    KILOMETER(1000),
    INCHES(0.0254),
    FEET(0.3048),
    YARDS(0.9144),
    Miles(1609.344),
    LITER(1);

    private double unitValue;

    LengthUnit(double referTo) {
        this.unitValue = referTo;
    }
    @Override
    public double getUnitValue() {
        return unitValue;
    }
}
