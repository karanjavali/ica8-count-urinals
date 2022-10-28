import java.io.*;
import java.util.ArrayList;

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

    // write output to txt file
    boolean writeToFile(File fileName, ArrayList<Integer> outputs) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream));

            for (int i = 0; i < outputs.size(); i++) {
                writer.write(Integer.toString(outputs.get(i)));
                writer.newLine();
            }

            writer.close();
            return true;
        }
        catch (Exception e) {
            return false;

        }

    }


    int numberOfUrinals(String str) {
        if(!goodString(str)) {
            return -1;
        }
        int numUrinals = 0;
        boolean prevZero = true;
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) == '0') {
                if (prevZero) {
                    if((i+1) == str.length() || str.charAt(i+1) == '0'){
                        numUrinals++;
                        prevZero = false;
                    }
                }
                else {
                    prevZero = true;
                }
            }
            else {
                prevZero = false;
            }
        }

        return numUrinals;
    }

}
