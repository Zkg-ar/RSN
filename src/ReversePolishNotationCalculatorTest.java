import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {

    private static ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        assertEquals(12,calculator.calculatePolishNotation("8 4 +"));
    }

    @Test
    public void shouldCalculateSubtraction() {
        assertEquals(4,calculator.calculatePolishNotation("8 4 -"));
    }

    @Test
    public void shouldCalculateЬultiplication() {
        assertEquals(32,calculator.calculatePolishNotation("8 4 *"));
    }

    @Test
    public void testHowDoesWorkBlank() {
        assertEquals(32,calculator.calculatePolishNotation("8 4     * "));
    }


}
