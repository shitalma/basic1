public class Volume extends Measurement{
    private double volume;
    private Unit.Volume unit;

    public Volume(double volume, Unit.Volume unit) throws IllegalArgumentException {
        if (volume < 0) throw new IllegalArgumentException();
        this.volume = volume;
        this.unit = unit;
    }

    public double getVolume() {
        return this.volume;
    }

    public Unit.Volume getUnit() {
        return this.unit;
    }

    public Volume convertTo(Unit.Volume second) {
        return new Volume((Math.round(this.getUnit().getUnitValue() / second.getUnitValue() * this.volume)), second);
    }
}
