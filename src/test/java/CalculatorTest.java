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
    public void addingNumbers() {
        assertEquals(7,calculator.addingNumbers());
    }

    @Test
    public void substractingNumbers() {
        assertEquals(3, calculator.subtractingNumbers());
    }

}
