package RegEx;

public class validPalindrome {
    public static void main(String[] args) {
        //ab_a is an edge case where \\W doesn't work;
        System.out.println(isPalindrome("ab_a"));
    }
    static boolean isPalindrome(String s) {
        // String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // String s1 = s.replaceAll("\\W", "").toLowerCase();
        String s1 = s.replaceAll("\\W|_", "").toLowerCase();
        System.out.println(s1);
        int start=0;
        int end=s1.length()-1;
        while(start<=end){
           if(s1.charAt(start) != s1.charAt(end)){
                return false;
           }
           start++;end--;
        }
    return true;
    }
}
