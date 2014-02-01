public class Volume extends Measurement{
    public Volume(double volume, VolumeUnit unit) throws IllegalArgumentException {
        super(volume, unit);
    }
    public Volume convertTo(VolumeUnit second) {
        return new Volume(this.getUnit().getUnitValue() / second.getUnitValue() * this.getQuantity(), second);
    }
}
