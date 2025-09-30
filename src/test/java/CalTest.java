import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalTest {

    private Cal cal;

    @BeforeEach
    void setup() {
        cal = new Cal();
    }

    @Test
    void addMe_addsTwoNumbers() {
        assertEquals(5, cal.addMe(2, 3));
        assertEquals(0, cal.addMe(-2, 2));
        assertEquals(-7, cal.addMe(-3, -4));
    }

    @Test
    void subMe_subtractsTwoNumbers() {
        assertEquals(2, cal.subMe(7, 5));
        assertEquals(-4, cal.subMe(-2, 2));
        assertEquals(1, cal.subMe(-3, -4));
    }

    @Test
    void mulMe_multipliesTwoNumbers() {
        assertEquals(24, cal.mulMe(4, 6));
        assertEquals(-8, cal.mulMe(-4, 2));
        assertEquals(0, cal.mulMe(0, 999));
    }

    @Test
    void divMe_dividesTwoNumbers() {
        assertEquals(4, cal.divMe(8, 2));
        assertEquals(-3, cal.divMe(-9, 3));
    }

    @Test
    void divMe_throwsWhenDividingByZero() {
        assertThrows(ArithmeticException.class, () -> cal.divMe(10, 0));
    }
}
