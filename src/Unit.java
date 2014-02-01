public class Unit {
    enum Length {
        CENTIMETER(0.01), METER(1), MILLIMETER(0.001), KILOMETER(1000), INCHES(0.0254), FEET(0.3048), YARDS(0.9144), Miles(1609.344), LITER(1);

        private double unitValue;

        Length(double referTo) {
            this.unitValue = referTo;
        }
        public double getUnitValue() {
            return unitValue;
        }
    }

    enum Volume {
        MILLILITER(0.001), KILOLITER(1000), GALLONS(3.7854099999999997) , LITER(1);
        private double unitValue;

        Volume(double referTo) {
            this.unitValue = referTo;
        }

        public double getUnitValue() {
            return unitValue;
        }
    }
}