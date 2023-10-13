package isp.lab3.exercise3;

import junit.framework.TestCase;
import org.junit.Test;

public class VehicleTest extends TestCase {
Vehicle vehicle1=new Vehicle("Dacia","Duster",190,'D');
    @Test
    public void testToString() {
        String expected = "Vehicle{Dacia(Duster), speed= 190, fuel type= D}";
        String actual = vehicle1.toString();
        assertEquals(expected, actual);
    }
}

