package RegEx;

import java.util.regex.*;
public class splitMethod {
    public static void main(String[] args) {
        // Pattern p = Pattern.compile("\\s"); --> splitting based on spaces
        // Pattern p = Pattern.compile("a"); --> splitting based on a character
        // Pattern p = Pattern.compile("."); --> no  Output beacause . means take any character whether special or not
        // Pattern p = Pattern.compile("\\."); //--> gives desired output. 
        Pattern p = Pattern.compile("[.]"); //--> same desired output as above.
        String[] s = p.split("www.Saurabh Kumar Jha.com");
        for (String string : s) {
            System.out.println(string);
        } 
    }
}
