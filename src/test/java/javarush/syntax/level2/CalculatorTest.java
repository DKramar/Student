package javarush.syntax.level2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldAddTwoNumbers() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        assertEquals(6, Calculator.multiply(2, 3));
    }
}
