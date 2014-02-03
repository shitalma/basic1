import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LengthTest {

    @Test(expected = IllegalArgumentException.class)
    public void testWhenLengthIsNegative() throws Exception {
        Length length = new Length(-1, LengthUnit.METER);
    }

// ----------------------------------- Test cases for Meter conversion ----------------------------------------

    @Test
    public void shouldConvertMeterToMillimeter() {
        Length length = new Length(1, LengthUnit.METER);
        Length expected = new Length(1000,LengthUnit.MILLIMETER);
        assertEquals(expected, length.convertTo(LengthUnit.MILLIMETER));
    }

    @Test
    public void shouldConvertMeterToCentimeter() {
        Length length = new Length(1, LengthUnit.METER);
        Length expected = new Length(100,LengthUnit.CENTIMETER);
        assertEquals(expected, length.convertTo(LengthUnit.CENTIMETER));
    }

    @Test
    public void shouldConvertMeterToKilometer() {
        Length length = new Length(1, LengthUnit.METER);
        Length expected = new Length(0.001,LengthUnit.KILOMETER);
        assertEquals(expected, length.convertTo(LengthUnit.KILOMETER));
    }

    @Test
    public void shouldConvertMeterToInches() {
        Length length = new Length(1, LengthUnit.METER);
        Length expected = new Length(39.37007874015748d,LengthUnit.INCHES);
        assertEquals(expected, length.convertTo(LengthUnit.INCHES));
    }

    @Test
    public void shouldConvertMeterToFeet() {
        Length length = new Length(1, LengthUnit.METER);
        Length expected = new Length(3.280839895013123d,LengthUnit.FEET);
        assertEquals(expected, length.convertTo(LengthUnit.FEET));
    }

    @Test
    public void shouldConvertMeterToYards() {
        Length length = new Length(1, LengthUnit.METER);
        Length expected = new Length(1.0936132983377078d,LengthUnit.YARDS);
        assertEquals(expected, length.convertTo(LengthUnit.YARDS));
    }

    @Test
    public void shouldConvertMeterToMiles() {
        Length length = new Length(1, LengthUnit.METER);
        Length expected = new Length(6.213711922373339E-4d,LengthUnit.Miles);
        assertEquals(expected, length.convertTo(LengthUnit.Miles));
    }

// ----------------------------------- Test cases for Centimeter conversion ----------------------------------------

    @Test
    public void shouldConvertCentimeterToMillimeter() {
        Length length = new Length(1, LengthUnit.METER);
        Length expected = new Length(1000d,LengthUnit.MILLIMETER);
        assertEquals(expected, length.convertTo(LengthUnit.MILLIMETER));
    }

    @Test
    public void shouldConvertCentimeterToMeter() {
        Length length = new Length(100, LengthUnit.CENTIMETER);
        Length expected = new Length(1d,LengthUnit.METER);
        assertEquals(expected, length.convertTo(LengthUnit.METER));
    }

    @Test
    public void shouldConvertCentimeterToKilometer() {
        Length length = new Length(100, LengthUnit.CENTIMETER);
        Length expected = new Length(0.001d,LengthUnit.KILOMETER);
        assertEquals(expected, length.convertTo(LengthUnit.KILOMETER));
    }

    @Test
    public void shouldConvertCentimeterToFeet() {
        Length length = new Length(100, LengthUnit.CENTIMETER);
        Length expected = new Length(3.2808398950131235d,LengthUnit.FEET);
        assertEquals(expected, length.convertTo(LengthUnit.FEET));
    }

    @Test
    public void shouldConvertCentimeterToInch() {
        Length length = new Length(100, LengthUnit.CENTIMETER);
        Length expected = new Length(39.37007874015748d,LengthUnit.INCHES);
        assertEquals(expected, length.convertTo(LengthUnit.INCHES));
    }

// ----------------------------------- Test cases for Kilometer conversion ----------------------------------------

    @Test
    public void shouldConvertKilometerToMillimeter() {
        Length length = new Length(1, LengthUnit.KILOMETER);
        Length expected = new Length(1000000.0d,LengthUnit.MILLIMETER);
        assertEquals(expected, length.convertTo(LengthUnit.MILLIMETER));
    }

    @Test
    public void shouldConvertKilometerToCentimeter() {
        Length length = new Length(1, LengthUnit.KILOMETER);
        Length expected = new Length(100000d,LengthUnit.CENTIMETER);
        assertEquals(expected, length.convertTo(LengthUnit.CENTIMETER));
    }

    @Test
    public void shouldConvertKilometerToInches() {
        Length length = new Length(1, LengthUnit.KILOMETER);
        Length expected = new Length(39370.078740157485d,LengthUnit.INCHES);
        assertEquals(expected, length.convertTo(LengthUnit.INCHES));
    }

    @Test
    public void shouldConvertKilometersToFeet() {
        Length length = new Length(1, LengthUnit.KILOMETER);
        Length expected = new Length(3280.839895013123d,LengthUnit.FEET);
        assertEquals(expected, length.convertTo(LengthUnit.FEET));
    }

    @Test
    public void shouldConvertKilometersToYards() {
        Length length = new Length(1, LengthUnit.KILOMETER);
        Length expected = new Length(1093.6132983377079d,LengthUnit.YARDS);
        assertEquals(expected, length.convertTo(LengthUnit.YARDS));
    }

    @Test
    public void shouldConvertKilometersToMiles() {
        Length length = new Length(1, LengthUnit.KILOMETER);
        Length expected = new Length(0.621371192237334d,LengthUnit.Miles);
        assertEquals(expected, length.convertTo(LengthUnit.Miles));
    }

// ----------------------------------- Test cases for Inches conversion ----------------------------------------

    @Test
    public void shouldConvertInchesToMillimeter() {
        Length length = new Length(1, LengthUnit.INCHES);
        Length expected = new Length(25.4d,LengthUnit.MILLIMETER);
        assertEquals(expected, length.convertTo(LengthUnit.MILLIMETER));
    }

    @Test
    public void shouldConvertInchesToCentimeter() {
        Length length = new Length(1, LengthUnit.INCHES);
        Length expected = new Length(2.54d,LengthUnit.CENTIMETER);

        assertEquals(expected, length.convertTo(LengthUnit.CENTIMETER));
    }

    @Test
    public void shouldConvertInchesToKilometer() {
        Length length = new Length(1, LengthUnit.INCHES);
        Length expected = new Length(2.5399999999999997E-5d,LengthUnit.KILOMETER);
        assertEquals(expected,length.convertTo(LengthUnit.KILOMETER));
    }

    @Test
    public void shouldConvertInchesToFeet() {
        Length length = new Length(1, LengthUnit.INCHES);
        Length expected = new Length(0.08333333333333333d,LengthUnit.FEET);
        assertEquals(expected, length.convertTo(LengthUnit.FEET));
    }

    @Test
    public void shouldConvertInchesToYards() {
        Length length = new Length(1, LengthUnit.INCHES);
        Length expected = new Length(0.027777777777777776d,LengthUnit.YARDS);
        assertEquals(expected, length.convertTo(LengthUnit.YARDS));
    }

    @Test
    public void shouldConvertInchesToMiles() {
        Length length = new Length(1, LengthUnit.INCHES);
        Length expected = new Length(1.5782828282828283E-5d,LengthUnit.Miles);
        assertEquals(expected, length.convertTo(LengthUnit.Miles));
    }

//  ------------------------ Test cases for addition of two units of length -------------------------------


    @Test
    public void testForAdditionOfTwoMeters() {
        Length meter1 = new Length(1,LengthUnit.METER);
        Length meter2 = new Length(1,LengthUnit.METER);
        Length expected = new Length(2,LengthUnit.METER);
        assertEquals(expected,meter1.addTo(meter2));

    }

    @Test
    public void testForAdditionOfMeterWithCentimeter() {
        Length meter = new Length(2,LengthUnit.METER);
        Length centimeter = new Length(100,LengthUnit.CENTIMETER);
        Length expected = new Length(3d,LengthUnit.METER);
        assertEquals(expected,meter.addTo(centimeter));
    }

    @Test
    public void testForAdditionOfCentimeterToMeter() {
        Length centimeter = new Length(1000,LengthUnit.CENTIMETER);
        Length meter = new Length(1,LengthUnit.METER);
        Length expected = new Length(1100d,LengthUnit.CENTIMETER);
        assertEquals(expected, centimeter.addTo(meter));
    }

    @Test
    public void testForAdditionOfMillimeterToMeter() {
        Length millimeter = new Length(1,LengthUnit.METER);
        Length meter = new Length(2000d,LengthUnit.MILLIMETER);
        Length expected = new Length(3000d,LengthUnit.MILLIMETER);
        assertEquals(expected, millimeter.addTo(meter));
    }
}