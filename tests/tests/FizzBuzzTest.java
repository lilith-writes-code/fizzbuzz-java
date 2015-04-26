package tests;

import com.venison.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FizzBuzzTest {

    @Test
    public void buzzPrintsDelimitedCountFromOneToFifteen() throws Exception {
        FizzBuzz testObj = new FizzBuzz();
        String expected = "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15";

        String actual = testObj.buzz();

        assertEquals(expected, actual);
    }
}