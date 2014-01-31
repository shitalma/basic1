import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class VolumeTest {
    @Test
    public void shouldConvertLiterToMilliliter() {
        Volume volume = new Volume(1,Unit.LITER);
        Volume actual = volume.convertTo(Unit.MILLILITER);

        assertEquals(volume, actual);
    }

}
