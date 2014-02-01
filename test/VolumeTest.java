import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class VolumeTest {

// ---------------------------- Test cases for Milliliter conversion -----------------------------------------

    @Test
    public void shouldConvertMilliliterToLiter() {
        Volume volume = new Volume(1,Unit.Volume.MILLILITER);
        assertEquals(volume, volume.convertTo(Unit.Volume.LITER));
    }

    @Test
    public void shouldConvertMilliliterToKiloliter() {
        Volume volume = new Volume(1,Unit.Volume.MILLILITER);
        assertEquals(volume, volume.convertTo(Unit.Volume.KILOLITER));
    }

    @Test
    public void shouldConvertMilliliterToGallons() {
        Volume volume = new Volume(1,Unit.Volume.MILLILITER);
        assertEquals(volume, volume.convertTo(Unit.Volume.GALLONS));
    }

// ---------------------------- Test cases for Liter conversion -----------------------------------------

    @Test
    public void shouldConvertLiterToMilliliter() {
        Volume volume = new Volume(1,Unit.Volume.LITER);
        assertEquals(volume, volume.convertTo(Unit.Volume.MILLILITER));
    }

    @Test
    public void shouldConvertLiterToKiloliter() {
        Volume volume = new Volume(1,Unit.Volume.LITER);
        assertEquals(volume, volume.convertTo(Unit.Volume.KILOLITER));
    }

    @Test
    public void shouldConvertLiterToGallons() {
        Volume volume = new Volume(1,Unit.Volume.LITER);
        assertEquals(volume, volume.convertTo(Unit.Volume.GALLONS));
    }

// ---------------------------- Test cases for Kiloliter conversion -----------------------------------------

    @Test
    public void shouldConvertKiloliterToMilliliter() {
        Volume volume = new Volume(1,Unit.Volume.KILOLITER);
        assertEquals(volume, volume.convertTo(Unit.Volume.MILLILITER));
    }

    @Test
    public void shouldConvertKiloliterToLiter() {
        Volume volume = new Volume(1,Unit.Volume.KILOLITER);
        assertEquals(volume, volume.convertTo(Unit.Volume.LITER));
    }

    @Test
    public void shouldConvertKiloliterToGallons() {
        Volume volume = new Volume(1,Unit.Volume.KILOLITER);
        assertEquals(volume, volume.convertTo(Unit.Volume.GALLONS));
    }
// ---------------------------- Test cases for Gallons conversion -----------------------------------------

    @Test
    public void shouldConvertGallonsToMilliliter() {
        Volume volume = new Volume(1,Unit.Volume.GALLONS);
        assertEquals(volume, volume.convertTo(Unit.Volume.MILLILITER));
    }

    @Test
    public void shouldConvertGallonsToLiter() {
        Volume volume = new Volume(1,Unit.Volume.GALLONS);
        assertEquals(volume, volume.convertTo(Unit.Volume.LITER));
    }

    @Test
    public void shouldConvertGallonsToKiloliter() {
        Volume volume = new Volume(1,Unit.Volume.GALLONS);
        assertEquals(volume, volume.convertTo(Unit.Volume.KILOLITER));
    }
}
