package filereader

import calculator.Calculator
import org.junit.jupiter.api.Test

import static filereader.NumberReader.*
import static org.junit.jupiter.api.Assertions.*;

class NumberReaderTest {

    @Test
    void testHighestNumber() {
        assertEquals(1000, getNumbers(resourceDir).max())
    }
    @Test
    void testSum() {
        assertEquals(1015, Calculator.addition(getNumbers(resourceDir)))
    }

}
