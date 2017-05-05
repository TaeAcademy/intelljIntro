import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by tjung on 5/5/2017.
 */
public class CalculatorTest {
    @Test
    public void add() throws Exception {
        assertEquals(2, Calculator.add(1,1));
    }
}