import org.junit.Assert;
import pl.zycinski.Palindrom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*** @author Dominik Zycinski
   * @version 1.01, 24/03/2018 */

class PalindromTest {

    @org.junit.jupiter.api.Test
    void isPalindrom() {
        String line;

        try {

            BufferedReader bufferreader = new BufferedReader(new FileReader("Palindromes.txt"));
            line = bufferreader.readLine();

            while (line != null) {
                Assert.assertTrue(Palindrom.isPalindrom(line));
                line = bufferreader.readLine();

            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }

    @org.junit.jupiter.api.Test
    void notPalindrom(){
        String line;

        try {

            BufferedReader bufferreader = new BufferedReader(new FileReader("notPalindromes.txt"));
            line = bufferreader.readLine();

            while (line != null) {
                Assert.assertFalse(Palindrom.isPalindrom(line));
                line = bufferreader.readLine();

            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}