
public enum VolumeUnit implements Unit{
    LITER(1),
    MILLILITER(0.001),
    KILOLITER(1000),
    GALLONS(3.7854099999999997);
    private double unitValue;

    VolumeUnit(double referTo) {
        this.unitValue = referTo;
    }
    @Override
    public double getUnitValue() {
        return unitValue;
    }
}
