package tests;

import com.venison.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FizzBuzzTest {

    @Test
    public void buzzHandlesMultiplesOfThreeAndFive() throws Exception {
        FizzBuzz testObj = new FizzBuzz();
        String expected = "1,2,Fizz,4,Buzz,Fizz,7,8,Fiz,Buzz,11,Fizz,13,14,FizzBuzz";

        String actual = testObj.buzz();

        assertEquals(expected, actual);
    }
}