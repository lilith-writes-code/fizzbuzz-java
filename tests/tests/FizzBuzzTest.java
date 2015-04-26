package tests;

import com.venison.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FizzBuzzTest {

    @Test
    public void buzzHandlesMultiplesOfThree() throws Exception {
        FizzBuzz testObj = new FizzBuzz();
        String expected = "1,2,Fizz,4,5,Fizz,7,8,Fiz,10,11,Fizz,13,14,Fizz";

        String actual = testObj.buzz();

        assertEquals(expected, actual);
    }
}