import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {
Cal cal=new Cal();
    @Test
    void addMe() {
        assertEquals(12, cal.addMe(9,3));
    }

    @Test
    void subMe() {
        assertEquals(6, cal.subMe(9,3));
    }

    @Test
    void mulMe() {
        assertEquals(27, cal.mulMe(9,3));
    }

    @Test
    void divMe() {
        assertEquals(3, cal.divMe(9,3));
    }
}