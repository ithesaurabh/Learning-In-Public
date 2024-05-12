package RegEx;

import java.util.regex.*;
public class classDemo2 {
    public static void main(String[] args) {
        // Pattern p = Pattern.compile("[ab]"); --> whether a or b ;
        // Pattern p = Pattern.compile("[^ab]");
        // Pattern p = Pattern.compile("[^a-z]");
        // Pattern p = Pattern.compile("[^a-zA-Z]");
        // Pattern p = Pattern.compile("[^a-zA-Z0-9]");
        Pattern p = Pattern.compile("[a-zA-Z0-9]");
        Matcher m = p.matcher("Ba7b@z!A#9");

        while(m.find()){
            System.out.println(m.start() + "..." + m.group());
        }
    }
}
