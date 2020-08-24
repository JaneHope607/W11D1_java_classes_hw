import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(25, calculator.add(10, 15));
    }

    @Test
    public void subtract() {
        assertEquals(5, calculator.subtract(15, 10));
    }

    @Test
    public void multiply() {
        assertEquals(150, calculator.multiply(10, 15));
    }

    @Test
    public void divide() {
        assertEquals(1.5, calculator.divide(15, 10), 0.01);
    }

}
