package calculator

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.*
class CalculatorTest {

    @Test
    void testAddition() {
        assertEquals(38, Calculator.addition([5, 10, 23]))
    }
    @Test
    void testSubtraction() {
        assertEquals(85, Calculator.subtraction([100, 10, 5]))
    }
    @Test
    void testMultiplication() {
        assertEquals(50, Calculator.multiplication([5, 5, 2]))
    }
    @Test
    void testDivition() {
        assertEquals(0.5f, Calculator.division([100, 5, 2, 10, 2]))
    }
    @Test
    void TestDivitionException() {
        assertThrows(Exception, () -> Calculator.division([100, 5, 0]))
    }
}
