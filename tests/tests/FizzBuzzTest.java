package tests;

import com.venison.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FizzBuzzTest {

    @Test
    public void buzzHandlesMultiplesOfThreeAndFive() throws Exception {
        int lower = 1;
        int upper = 15;
        FizzBuzz testObj = BuildTestObject(upper, lower);
        String expected = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz";

        String actual = testObj.buzz();

        assertEquals(expected, actual);
    }

    private FizzBuzz BuildTestObject(int upper, int lower) {
        return new FizzBuzz(lower, upper);
    }

    @Test
    public void buzz_givenBounds_printsProperStatement() throws Exception {
        int lower = 5;
        int upper = 15;
        FizzBuzz testObj = BuildTestObject(upper, lower);
        String expected = "Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz";

        String actual = testObj.buzz();

        assertEquals(expected, actual);
    }

    @Test
    public void buzz_givenBoundsAboveLastFizzBuzzPrintout_printsProperStatement() throws Exception {
        int lower = 5;
        int upper = 16;
        FizzBuzz testObj = BuildTestObject(upper, lower);
        String expected = "Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16";

        String actual = testObj.buzz();

        assertEquals(expected, actual);
    }
}