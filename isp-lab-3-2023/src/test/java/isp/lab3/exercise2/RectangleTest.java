package isp.lab3.exercise2;

import static org.junit.Assert.assertEquals;

import isp.lab3.exercise1.Tree;
import junit.framework.TestCase;
import org.junit.Test;

public class RectangleTest extends TestCase {
    Rectangle rectangle = new Rectangle();

    @Test
    public void testRectangle() {
        assertEquals("Should give the perimeter: ", 16, Rectangle.getPerimeter());
        assertEquals("should give the area", 15, Rectangle.getArea());
    }

}