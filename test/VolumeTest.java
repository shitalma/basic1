import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class VolumeTest {

// ---------------------------- Test cases for Milliliter conversion -----------------------------------------

    @Test
    public void shouldConvertMilliliterToLiter() {
        Volume volume = new Volume(1,VolumeUnit.MILLILITER);
        Volume expected = new Volume(0.001,VolumeUnit.LITER);
        assertEquals(expected, volume.convertTo(VolumeUnit.LITER));
    }

    @Test
    public void shouldConvertMilliliterToKiloliter() {
        Volume volume = new Volume(1,VolumeUnit.MILLILITER);
        Volume expected = new Volume(0.000001,VolumeUnit.KILOLITER);
        assertEquals(expected, volume.convertTo(VolumeUnit.KILOLITER));
    }

    @Test
    public void shouldConvertMilliliterToGallons() {
        Volume volume = new Volume(1,VolumeUnit.MILLILITER);
        Volume expected = new Volume(2.64172176857989E-4,VolumeUnit.GALLONS);
        assertEquals(expected, volume.convertTo(VolumeUnit.GALLONS));
    }

// ---------------------------- Test cases for Liter conversion -----------------------------------------

    @Test
    public void shouldConvertLiterToMilliliter() {
        Volume volume = new Volume(1,VolumeUnit.LITER);
        Volume expected = new Volume(1000d,VolumeUnit.MILLILITER);
        assertEquals(expected, volume.convertTo(VolumeUnit.MILLILITER));
    }

    @Test
    public void shouldConvertLiterToKiloliter() {
        Volume volume = new Volume(1,VolumeUnit.LITER);
        Volume expected = new Volume(0.001,VolumeUnit.KILOLITER);
        assertEquals(expected, volume.convertTo(VolumeUnit.KILOLITER));
    }

    @Test
    public void shouldConvertLiterToGallons() {
        Volume volume = new Volume(1,VolumeUnit.LITER);
        Volume expected = new Volume(0.264172176857989,VolumeUnit.GALLONS);
        assertEquals(volume, volume.convertTo(VolumeUnit.GALLONS));
    }

// ---------------------------- Test cases for Kiloliter conversion -----------------------------------------

    @Test
    public void shouldConvertKiloliterToMilliliter() {
        Volume volume = new Volume(1,VolumeUnit.KILOLITER);
        Volume expected = new Volume(1000000d,VolumeUnit.MILLILITER);
        assertEquals(expected, volume.convertTo(VolumeUnit.MILLILITER));
    }

    @Test
    public void shouldConvertKiloliterToLiter() {
        Volume volume = new Volume(1,VolumeUnit.KILOLITER);
        Volume expected = new Volume(1000d,VolumeUnit.LITER);
        assertEquals(expected, volume.convertTo(VolumeUnit.LITER));
    }

    @Test
    public void shouldConvertKiloliterToGallons() {
        Volume volume = new Volume(1,VolumeUnit.KILOLITER);
        Volume expected = new Volume(264.172176857989d,VolumeUnit.GALLONS);
        assertEquals(expected, volume.convertTo(VolumeUnit.GALLONS));
    }
// ---------------------------- Test cases for Gallons conversion -----------------------------------------

    @Test
    public void shouldConvertGallonsToMilliliter() {
        Volume volume = new Volume(1,VolumeUnit.GALLONS);
        Volume expected = new Volume(3785.41,VolumeUnit.MILLILITER);
        assertEquals(expected, volume.convertTo(VolumeUnit.MILLILITER));
    }

    @Test
    public void shouldConvertGallonsToLiter() {
        Volume volume = new Volume(1,VolumeUnit.GALLONS);
        Volume expected = new Volume(3.7854099999999997d,VolumeUnit.LITER);
        assertEquals(expected, volume.convertTo(VolumeUnit.LITER));
    }

    @Test
    public void shouldConvertGallonsToKiloliter() {
        Volume volume = new Volume(1,VolumeUnit.GALLONS);
        Volume expected = new Volume(0.00378541d,VolumeUnit.KILOLITER);
        assertEquals(expected, volume.convertTo(VolumeUnit.KILOLITER));
    }
}
