import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void add1() {
        Assertions.assertEquals(0, Calculator.add(0, 0));
    }

    @Test
    void add2() {
        Assertions.assertEquals(5, Calculator.add(5, 0));
    }

    @Test
    void add3() {
        Assertions.assertEquals(8, Calculator.add(5, 3));
    }

    @Test
    void twice1() {
        Assertions.assertEquals(6, Calculator.twice(3));
    }

    @Test
    void twice2() {
        Assertions.assertEquals(6, Calculator.twice(-3));
    }
}