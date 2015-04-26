package tests;

import com.venison.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FizzBuzzTest {

    @Test
    public void buzzHandlesMultiplesOfThreeAndFive() throws Exception {
        FizzBuzz testObj = new FizzBuzz();
        String expected = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz";

        String actual = testObj.buzz();

        assertEquals(expected, actual);
    }

    @Test
    public void buzz_givenBounds_printsProperStatement() throws Exception {
        int lower = 5;
        int upper = 15;
        FizzBuzz testObj = new FizzBuzz(lower, upper);
        String expected = "Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz";

        String actual = testObj.buzz();

        assertEquals(expected, actual);
    }
}