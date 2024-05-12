package RegEx;

import java.util.StringTokenizer;

public class stringTokenizer {
    public static void main(String[] args) {
        //String Class also has a split method which works almost same as of Pattern class
        String s = "Saurabh Kumar Jha";
        String[] str = s.split("\\s");
        for (String string : str) {
            System.out.println(string);
        }
        System.out.println("------------------------");
        // StringTokenizer st = new StringTokenizer("Saurabh Kumar Jha");
        StringTokenizer st = new StringTokenizer("12:05:2024", ":");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
