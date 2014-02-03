public class Volume extends Measurement{
    public Volume(double volume, VolumeUnit unit) throws IllegalArgumentException {
        super(volume, unit);
    }
    public Volume convertTo(VolumeUnit other) {
        Measurement measurement = super.convertTo(other);
        return new Volume(measurement.getQuantity(), other);
    }

    public Volume addTo(Volume length) {
        Measurement measurement = super.addTo(length);
        return new Volume(measurement.getQuantity(), (VolumeUnit) measurement.getUnit());
    }
}
