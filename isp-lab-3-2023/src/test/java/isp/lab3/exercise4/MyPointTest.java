package isp.lab3.exercise4;

import junit.framework.TestCase;
import org.junit.Test;

public class MyPointTest extends TestCase {
    @Test
    public void testdistance() {
        MyPoint point = new MyPoint(5, 5, 5);
        int x = 0;
        int y = 0;
        int z = 0;
        double distance = point.distance(x, y, z);
    }

}