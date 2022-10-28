import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Karan Navin Javali
 */
class urinalsTest {

    urinals urinalObj = new urinals();

    @Test
    void testGoodString1() {
        System.out.println("===== Test 1 - Check if 101 is good =====");
        Assertions.assertEquals(true,urinalObj.goodString("101"));
    }
}