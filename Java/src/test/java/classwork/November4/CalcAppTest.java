package classwork.November4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcAppTest {
    private CalcApp app;

    @Before
    public void before() {
        this.app = new CalcApp();
    }

    @Test
    void calc1_should_ok() {
        assertEquals(1, app.calc("()()()()()"));
    }

    @Test
    void calc2_should_ok() {
        assertEquals(2, app.calc("(()()()()())"));
    }

    @Test
    void calc3_should_ok() {
        assertEquals(3, app.calc("((()))()(())"));
    }


}