package RegEx;

import java.util.regex.*;

public class quantifiers {
    public static void main(String[] args) {
        // Pattern p = Pattern.compile("a");  --> only one a
        // Pattern p = Pattern.compile("a+"); --> atleast one a
        // Pattern p = Pattern.compile("a*"); --> any no. of a's including 0
        Pattern p = Pattern.compile("a?"); // --> either 1 a or 0 a
        Matcher m = p.matcher("abaabaaabcaab");

        while (m.find()) {
            System.out.println(m.start() + " ---> " + m.group());
        }
    }
}
