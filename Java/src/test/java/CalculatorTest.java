import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator c = new Calculator();
        assertEquals(8, c.add(6, 2));
    }

    @Test
    public void sub() {
        Calculator c = new Calculator();
        assertEquals(4, c.sub(6, 2));
    }
}