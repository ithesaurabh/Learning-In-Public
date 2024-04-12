import java.util.HashSet;



public class findDifferende {
    public static void main(String[] args) {
    //    String s = "abcd", t = "abcde";
       String s = "", t = "y";
       char ans = findTheDifference(s, t);

       System.out.println(ans);
    }
    static char findTheDifference(String s, String t) {
    HashSet<Character> Set1 = new HashSet<>();

    int i =0;
    int j =0;
    while (i<s.length()) {
        Set1.add(s.charAt(i));
        i++;
    }
    
    while (j<t.length()) {
        if (!Set1.contains(t.charAt(j))) {
            return t.charAt(j);
        }
        else j++;
    }
    return t.charAt(t.length()-1);
}
}
