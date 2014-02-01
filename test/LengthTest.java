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
        assertEquals(length, length.convertTo(LengthUnit.MILLIMETER));
    }

    @Test
    public void shouldConvertMeterToCentimeter() {
        Length length = new Length(1, LengthUnit.METER);
        assertEquals(length, length.convertTo(LengthUnit.CENTIMETER));
    }

    @Test
    public void shouldConvertMeterToKilometer() {
        Length length = new Length(1, LengthUnit.METER);
        assertEquals(length, length.convertTo(LengthUnit.KILOMETER));
    }

    @Test
    public void shouldConvertMeterToInches() {
        Length length = new Length(1, LengthUnit.METER);
        assertEquals(length, length.convertTo(LengthUnit.INCHES));
    }

    @Test
    public void shouldConvertMeterToFeet() {
        Length length = new Length(1, LengthUnit.METER);
        assertEquals(length, length.convertTo(LengthUnit.FEET));
    }

    @Test
    public void shouldConvertMeterToYards() {
        Length length = new Length(1, LengthUnit.METER);
        assertEquals(length, length.convertTo(LengthUnit.YARDS));
    }

    @Test
    public void shouldConvertMeterToMiles() {
        Length length = new Length(1, LengthUnit.METER);
        assertEquals(length, length.convertTo(LengthUnit.Miles));
    }

// ----------------------------------- Test cases for Centimeter conversion ----------------------------------------

    @Test
    public void shouldConvertCentimeterToMillimeter() {
        Length length = new Length(1, LengthUnit.METER);
        assertEquals(length, length.convertTo(LengthUnit.MILLIMETER));
    }

    @Test
    public void shouldConvertCentimeterToMeter() {
        Length length = new Length(100, LengthUnit.CENTIMETER);
        assertEquals(length, length.convertTo(LengthUnit.METER));
    }

    @Test
    public void shouldConvertCentimeterToKilometer() {
        Length length = new Length(100, LengthUnit.CENTIMETER);
        assertEquals(length, length.convertTo(LengthUnit.KILOMETER));
    }

    @Test
    public void shouldConvertCentimeterToFeet() {
        Length length = new Length(100, LengthUnit.CENTIMETER);
        assertEquals(length, length.convertTo(LengthUnit.FEET));
    }

    @Test
    public void shouldConvertCentimeterToInch() {
        Length length = new Length(100, LengthUnit.CENTIMETER);
        assertEquals(length, length.convertTo(LengthUnit.INCHES));
    }

// ----------------------------------- Test cases for Kilometer conversion ----------------------------------------

    @Test
    public void shouldConvertKilometerToMillimeter() {
        Length length = new Length(1, LengthUnit.KILOMETER);
        assertEquals(length, length.convertTo(LengthUnit.MILLIMETER));
    }

    @Test
    public void shouldConvertKilometerToCentimeter() {
        Length length = new Length(1, LengthUnit.KILOMETER);
        assertEquals(length, length.convertTo(LengthUnit.CENTIMETER));
    }

    @Test
    public void shouldConvertKilometerToInches() {
        Length length = new Length(1, LengthUnit.KILOMETER);
        assertEquals(length, length.convertTo(LengthUnit.INCHES));
    }

    @Test
    public void shouldConvertKilometersToFeet() {
        Length length = new Length(1, LengthUnit.KILOMETER);
        assertEquals(length, length.convertTo(LengthUnit.FEET));
    }

    @Test
    public void shouldConvertKilometersToYards() {
        Length length = new Length(1, LengthUnit.KILOMETER);
        assertEquals(length, length.convertTo(LengthUnit.YARDS));
    }

    @Test
    public void shouldConvertKilometersToMiles() {
        Length length = new Length(1, LengthUnit.KILOMETER);
        assertEquals(length, length.convertTo(LengthUnit.Miles));
    }

// ----------------------------------- Test cases for Inches conversion ----------------------------------------

    @Test
    public void shouldConvertInchesToMillimeter() {
        Length length = new Length(1, LengthUnit.INCHES);
        assertEquals(length, length.convertTo(LengthUnit.MILLIMETER));
    }

    @Test
    public void shouldConvertInchesToCentimeter() {
        Length length = new Length(1, LengthUnit.INCHES);
        assertEquals(length, length.convertTo(LengthUnit.CENTIMETER));
    }

    @Test
    public void shouldConvertInchesToKilometer() {
        Length length = new Length(1, LengthUnit.INCHES);
        assertEquals(length,length.convertTo(LengthUnit.KILOMETER));
    }

    @Test
    public void shouldConvertInchesToFeet() {
        Length length = new Length(1, LengthUnit.INCHES);
        assertEquals(length, length.convertTo(LengthUnit.FEET));
    }

    @Test
    public void shouldConvertInchesToYards() {
        Length length = new Length(1, LengthUnit.INCHES);
        assertEquals(length, length.convertTo(LengthUnit.YARDS));
    }

    @Test
    public void shouldConvertInchesToMiles() {
        Length length = new Length(1, LengthUnit.INCHES);
        assertEquals(length, length.convertTo(LengthUnit.Miles));
    }
}