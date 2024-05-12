package RegEx;

import java.util.regex.*;
public class classDemo3 {
    public static void main(String[] args) {
        //Pattern p = Pattern.compile("\\s"); <-- Only Space
        // Pattern p = Pattern.compile("\\S");  <-- Except Space
        // Pattern p = Pattern.compile("\\d"); <-- Only Digits
        // Pattern p = Pattern.compile("\\D");  <-- Except Digits
        // Pattern p = Pattern.compile("\\w");  <-- Only Alphaneumeric Characters
        // Pattern p = Pattern.compile("\\W");  <-- Except Alphaneumeric Characters, only special characters
        Pattern p = Pattern.compile("."); 
        Matcher m = p.matcher("Ba7b@ z!A#9");

        while(m.find()){
            System.out.println(m.start() + "..." + m.group());
        }
    }
}
