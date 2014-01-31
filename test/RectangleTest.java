import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void testWhichCalculatePerimeterOfRectangle() {
        Rectangle rectangle = Rectangle.getRectangle(2, 3);
        assertEquals(6.0, rectangle.area());
    } 
    @Test
    public void testWhichCalculateAreaOfSquare() {
        Rectangle rectangle = Rectangle.getSquare(2);
        assertEquals(4.0, rectangle.area());
    }
}
