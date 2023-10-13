package aut.isp.lab4.exercise1;

import junit.framework.TestCase;
import org.junit.Test;

import java.sql.SQLOutput;

public class Exercise1Test extends TestCase {
    AquariumController aquariumController = new AquariumController("marca", "happy", 15.23F);
    @Test
            public void TestErxercise1 () {
        assertEquals("AquariumController{manufacturer='marca, model='happy, currentTime=15.23}",aquariumController);
    }

}