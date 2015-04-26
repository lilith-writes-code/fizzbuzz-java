package tests;

import com.venison.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FizzBuzzTest {

    @Test
    public void buzzReturnsString() throws Exception {
        FizzBuzz testObj = new FizzBuzz();
        String expected = "";

        String actual = testObj.buzz();

        assertEquals(expected, actual);
    }
}