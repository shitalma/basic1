import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LengthTest {

    @Test(expected = IllegalArgumentException.class)
    public void testWhenLengthIsNegative() throws Exception {
        Length length = new Length(-1, Unit.METER);
    }

// ----------------------------------- Test cases for Meter conversion ----------------------------------------

    @Test
    public void shouldConvertMeterToMillimeter() {
        Length length = new Length(1, Unit.METER);
        Length actual = length.convertTo(Unit.MILLIMETER);

        assertEquals(1000d, actual.getLength());
        assertEquals(Unit.MILLIMETER, actual.getUnit());
        assertEquals(length, actual);
    }

    @Test
    public void shouldConvertMeterToCentimeter() {
        Length length = new Length(1, Unit.METER);
        Length actual = length.convertTo(Unit.CENTIMETER);

        assertEquals(100d, actual.getLength());
        assertEquals(Unit.CENTIMETER, actual.getUnit());
        assertEquals(length, actual);
    }

    @Test
    public void shouldConvertMeterToKilometer() {
        Length length = new Length(1, Unit.METER);
        Length actual = length.convertTo(Unit.KILOMETER);

        assertEquals(0.001d, actual.getLength());
        assertEquals(Unit.KILOMETER, actual.getUnit());
        assertEquals(length, actual);
    }

    @Test
    public void shouldConvertMeterToInches() {
        Length length = new Length(1, Unit.METER);
        Length actual = length.convertTo(Unit.INCHES);

        assertEquals(39.37007874015748d, actual.getLength());
        assertEquals(Unit.INCHES, actual.getUnit());
        assertEquals(length, actual);
    }

    @Test
    public void shouldConvertMeterToFeet() {
        Length length = new Length(1, Unit.METER);
        Length actual = length.convertTo(Unit.FEET);

        assertEquals(3.280839895013123d, actual.getLength());
        assertEquals(Unit.FEET, actual.getUnit());
        assertEquals(length, actual);
    }

    @Test
    public void shouldConvertMeterToYards() {
        Length length = new Length(1, Unit.METER);
        Length actual = length.convertTo(Unit.YARDS);

        assertEquals(1.0936132983377078d, actual.getLength());
        assertEquals(Unit.YARDS, actual.getUnit());
        assertEquals(length, actual);
    }

    @Test
    public void shouldConvertMeterToMiles() {
        Length length = new Length(1, Unit.METER);
        Length actual = length.convertTo(Unit.Miles);

        assertEquals(6.213711922373339E-4d, actual.getLength());
        assertEquals(Unit.Miles, actual.getUnit());
        assertEquals(length, actual);
    }

// ----------------------------------- Test cases for Centimeter conversion ----------------------------------------

    @Test
    public void shouldConvertCentimeterToMillimeter() {
        Length length = new Length(1, Unit.CENTIMETER);
        Length actual = length.convertTo(Unit.MILLIMETER);

        assertEquals(10d, actual.getLength());
        assertEquals(Unit.MILLIMETER, actual.getUnit());
        assertEquals(length, actual);
    }

    @Test
    public void shouldConvertCentimeterToMeter() {
        Length length = new Length(100, Unit.CENTIMETER);
        Length actual = length.convertTo(Unit.METER);

        assertEquals(1d, actual.getLength());
        assertEquals(Unit.METER, actual.getUnit());
        assertEquals(length, actual);
    }

    @Test
    public void shouldConvertCentimeterToKilometer() {
        Length length = new Length(100, Unit.CENTIMETER);
        Length actual = length.convertTo(Unit.KILOMETER);

        assertEquals(0.001d, actual.getLength());
        assertEquals(Unit.KILOMETER, actual.getUnit());
        assertEquals(length, actual);
    }

    @Test
    public void shouldConvertCentimeterToFeet() {
        Length length = new Length(100, Unit.CENTIMETER);
        Length actual = length.convertTo(Unit.FEET);

        assertEquals(3.2808398950131235d, actual.getLength());
        assertEquals(Unit.FEET, actual.getUnit());
        assertEquals(length, actual);
    }

    @Test
    public void shouldConvertCentimeterToInch() {
        Length length = new Length(100, Unit.CENTIMETER);
        Length actual = length.convertTo(Unit.INCHES);

        assertEquals(39.37007874015748, actual.getLength());
        assertEquals(Unit.INCHES, actual.getUnit());
        assertEquals(length, actual);
    }

// ----------------------------------- Test cases for Kilometer conversion ----------------------------------------

    @Test
    public void shouldConvertKilometerToMillimeter() {
        Length length = new Length(1, Unit.KILOMETER);
        Length actual = length.convertTo(Unit.MILLIMETER);

        assertEquals(1000000d, actual.getLength());
        assertEquals(Unit.MILLIMETER, actual.getUnit());
        assertEquals(length, actual);
    }

    @Test
    public void shouldConvertKilometerToCentimeter() {
        Length length = new Length(1, Unit.KILOMETER);
        Length actual = length.convertTo(Unit.CENTIMETER);

        assertEquals(100000d, actual.getLength());
        assertEquals(Unit.CENTIMETER, actual.getUnit());
        assertEquals(length, actual);
    }

    @Test
    public void shouldConvertKilometerToInches() {
        Length length = new Length(1, Unit.KILOMETER);
        Length actual = length.convertTo(Unit.INCHES);

        assertEquals(39370.078740157485d, actual.getLength());
        assertEquals(Unit.INCHES, actual.getUnit());
        assertEquals(length, actual);
    }

    @Test
    public void shouldConvertKilometersToFeet() {
        Length length = new Length(1, Unit.KILOMETER);
        Length actual = length.convertTo(Unit.FEET);

        assertEquals(3280.839895013123d, actual.getLength());
        assertEquals(Unit.FEET, actual.getUnit());
        assertEquals(length, actual);
    }

    @Test
    public void shouldConvertKilometersToYards() {
        Length length = new Length(1, Unit.METER);
        Length actual = length.convertTo(Unit.YARDS);

        assertEquals(1.0936132983377078d, actual.getLength());
        assertEquals(Unit.YARDS, actual.getUnit());
        assertEquals(length, actual);
    }

    @Test
    public void shouldConvertKilometersToMiles() {
        Length length = new Length(1, Unit.KILOMETER);
        Length actual = length.convertTo(Unit.Miles);

        assertEquals(0.621371192237334d, actual.getLength());
        assertEquals(Unit.Miles, actual.getUnit());
        assertEquals(length, actual);
    }

// ----------------------------------- Test cases for Inches conversion ----------------------------------------

    @Test
    public void shouldConvertInchesToMillimeter() {
        Length length = new Length(1, Unit.INCHES);
        Length actual = length.convertTo(Unit.MILLIMETER);

        assertEquals(25.4d, actual.getLength());
        assertEquals(Unit.MILLIMETER, actual.getUnit());
        assertEquals(length, actual);
    }

    @Test
    public void shouldConvertInchesToCentimeter() {
        Length length = new Length(1, Unit.INCHES);
        Length actual = length.convertTo(Unit.CENTIMETER);

        assertEquals(2.54d, actual.getLength());
        assertEquals(Unit.CENTIMETER, actual.getUnit());
        assertEquals(length, actual);
    }

    @Test
    public void shouldConvertInchesToKilometer() {
        Length length = new Length(1, Unit.INCHES);
        Length actual = length.convertTo(Unit.KILOMETER);

        assertEquals(2.5399999999999997E-5d, actual.getLength());
        assertEquals(Unit.KILOMETER, actual.getUnit());
        assertEquals(length, actual);
    }

    @Test
    public void shouldConvertInchesToFeet() {
        Length length = new Length(1, Unit.INCHES);
        Length actual = length.convertTo(Unit.FEET);

        assertEquals(0.08333333333333333d, actual.getLength());
        assertEquals(Unit.FEET, actual.getUnit());
        assertEquals(length, actual);
    }

    @Test
    public void shouldConvertInchesToYards() {
        Length length = new Length(1, Unit.INCHES);
        Length actual = length.convertTo(Unit.YARDS);

        assertEquals(0.027777777777777776d, actual.getLength());
        assertEquals(Unit.YARDS, actual.getUnit());
        assertEquals(length, actual);
    }

    @Test
    public void shouldConvertInchesToMiles() {
        Length length = new Length(1, Unit.INCHES);
        Length actual = length.convertTo(Unit.Miles);

        assertEquals(1.5782828282828283E-5d, actual.getLength());
        assertEquals(Unit.Miles, actual.getUnit());
        assertEquals(length, actual);
    }
}