package recursion;

public class removeChar {
    public static void main(String[] args) {
        String s= "aabcapplecdab";
        String res = "";
        // remChar(s, res);
        System.out.println(skipWord("apple"));
    }
    static void remChar(String s,String Ans){

        if (s.isEmpty()) {
            System.out.println(Ans);
            return ;
        }
        
        char ch = s.charAt(0);
        if (ch == 'a') {
            remChar(s.substring(1), Ans);
        }
        else{
            remChar(s.substring(1), Ans+ch);
        }
    }
    static String remChar(String s){
        StringBuilder str = new StringBuilder();
        if (s.isEmpty()) {
            return "";
        }
        char ch = s.charAt(0);
        
        if (ch == 'a') {
            return remChar(s.substring(1));
        }
        else{
            return ch + remChar(s.substring(1));    
        }
    }
    static String skipWord(String s){
        if (s.isEmpty()) {

            return s.substring( 1);
        }

        if (s.startsWith("apple")) {
            return skipWord(s.substring(5));
            
        }else{
            return s.charAt(0) + skipWord(s.substring(1));

        }
    }
}   
