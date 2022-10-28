import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Karan Navin Javali
 */
class urinalsTest {

    urinals urinalObj = new urinals();
    String completePath = "src/main/java/rule";
    @Test
    void testGoodString1() {
        System.out.println("===== Test 1 - Check if 101 is good =====");
        Assertions.assertEquals(true,urinalObj.goodString("101"));
    }

    @Test
    void testGoodString2() {
        System.out.println("===== Test 2 - Check if 110 is good =====");
        Assertions.assertEquals(true,urinalObj.goodString("110"));
    }

    @Test
    void testGoodString3() {
        System.out.println("===== Test 3 - Check if Karan is not good =====");
        Assertions.assertEquals(false,urinalObj.goodString("Karan"));
    }


    @Test
    void testGetFile1() {
        System.out.println("===== Test 1 - Check if rule.txt is created =====");
        File newFile = new File(completePath+".txt");
        Assertions.assertEquals(newFile,urinalObj.getFile());
    }
}