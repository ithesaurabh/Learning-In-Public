package RegEx;

import java.util.regex.*;
public class classDemo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher("abcbdababbbbsabaab");

        int count = 0;
        while(m.find()){
            count++;
            System.out.println(m.start() + "..." + m.end() + "..." + m.group());

        }
        System.out.println("The number of results are : " + count);
    }
}
