import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Karan Navin Javali
 */
class urinalsTest {

    // urinals class obj
    urinals urinalObj = new urinals();

    // path to rule txt files
    String completePath = "src/main/java/rule";

    // dummy output list
    ArrayList<Integer> outputs= new ArrayList<Integer>();

    // initialize dummy outputs array list with some random values
    urinalsTest() {
        outputs.add(1);
        outputs.add(0);
        outputs.add(-1);
        outputs.add(1);
        outputs.add(2);
    }

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
    void testGetFile1() throws IOException {
        System.out.println("===== Test 1 - Check if rule.txt is created =====");
        File newFile = new File(completePath+".txt");
        Assertions.assertEquals(newFile,urinalObj.getFile());
    }

    @Test
    void testGetFile2() throws IOException {
        System.out.println("===== Test 2 - Check if rule3.txt is created after rule.txt =====");
        File newFile = new File(completePath+"3.txt");
        Assertions.assertEquals(newFile,urinalObj.getFile());
    }

    @Test
    void testWriteToFile1(){
        System.out.println("===== Test 1 - Check if output is written to rule.txt =====");
        File newFile = new File(completePath+".txt");
        Assertions.assertEquals(true, urinalObj.writeToFile(newFile,outputs));
    }

    @Test
    void testWriteToFile2() {
        System.out.println("===== Test 2 - Check if output is written to rule4.txt =====");
        File newFile = new File(completePath+"4.txt");
        Assertions.assertEquals(true, urinalObj.writeToFile(newFile,outputs));
    }
}