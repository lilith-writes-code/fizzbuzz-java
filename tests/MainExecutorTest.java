import com.venison.MainExecutor;
import com.venison.WriteStuff;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainExecutorTest {

    @Test
    public void ExecuteWritesEmptyString(){
        StubWriter stubWriter = new StubWriter();
        String expected = "";
        MainExecutor testObj = new MainExecutor(stubWriter);

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