package tests;

import com.venison.FizzBuzz;
import com.venison.MainExecutor;
import com.venison.WriteStuff;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainExecutorTest {

    @Test
    public void givenConfiguredFizzBuzz_printsOutItsValues(){
        StubWriter stubWriter = new StubWriter();
        String expected = "1,2,Fizz,4,Buzz";
        MainExecutor testObj = new MainExecutor(stubWriter, new FizzBuzz(1,5));

        testObj.execute();

        assertEquals(expected, stubWriter.writtenStuff);
    }

    private class StubWriter implements WriteStuff{
        public String writtenStuff;

        @Override
        public void Write(String someString) {
            writtenStuff = someString;
        }
    }
}