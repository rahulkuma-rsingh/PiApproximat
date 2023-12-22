package randompiestimation;

import static org.junit.Assert.*;

import org.junit.Test;

public class PiEstimationTest {

	@Test
    public void testEstimatePi() {
        int numPoints = 1000000;
        double piEstimation = PiEstimation.estimatePi(numPoints);

        
        assertTrue("Pi estimation is not within an acceptable range", Math.abs(piEstimation - Math.PI) < 0.01);
    }

}
