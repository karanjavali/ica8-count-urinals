import java.io.File;
import java.io.IOException;

/**
 * @author Karan Navin Javali
 */
public class urinals {

    // checks to see if valid string
    Boolean goodString( String str ) {

        // check if input string is valid
        boolean manPresent = false;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='1') {
                if(manPresent == true) {
                    return false;
                }
                manPresent = true;
            } else if (str.charAt(i) == '0') {
                manPresent = false;
            }
            else {
                return false;
            }
        }
        return true;
    }

    File getFile() throws IOException {
        String completePath = "src/main/java/";
        String fileName = "rule";
        String extension = ".txt";
        // create/check for rule.txt
        File txtFile = new File(completePath + fileName + extension);
        if (txtFile.createNewFile()) {
            System.out.println("File created: " + txtFile.getName());
            return txtFile;
        } else {
            // create rule1.txt or rule2.txt..... since rule.txt exists
            int i = 1;
            while(true) {
                File newFile = new File(completePath + fileName + i + extension);
                if (newFile.createNewFile()) {
                    System.out.println("File created: " + newFile.getName());
                    return newFile;
                }
                else {
                    i++;
                }
            }
        }
    }

}
