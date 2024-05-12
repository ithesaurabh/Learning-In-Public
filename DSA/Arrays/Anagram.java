import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        
    }public boolean isAnagram(String s, String t) {
            char[] AS = s.toCharArray();
            char[] AT = t.toCharArray();

            
            Arrays.sort(AS);
            Arrays.sort(AT);

            if(AS.length != AT.length){
                return false;
            }
            String sortedString1 = new String(AS);
            String sortedString2 = new String(AT);
            
            if(sortedString1.equals(sortedString2)){
                return true;
            }


            return false;
        }
}
