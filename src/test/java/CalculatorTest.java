import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(5, 2);
    }

    @Test
    public void hasFirstNumber() {
        assertEquals(5, calculator.firstNumber());
    }

    @Test
    public void hasSecondNumber() {
        assertEquals(2, calculator.secondNumber());
    }

    @Test
    public void addingNumbersTest() {
        assertEquals(7,calculator.addingNumbers());
    }

    @Test
    public void subtractingNumbersTest() {
        assertEquals(3, calculator.subtractingNumbers());
    }

    @Test
    public void multiplyingNumbersTest() {
        assertEquals(10, calculator.multiplyingNumbers());
    }

    @Test
    public void dividingNumbersTest() {
        assertEquals(2, calculator.dividingNumbers());
    }

}
