package recursion;

import java.util.*;

public class letterCombOfPhoneNo {
    public static void main(String[] args) {
        // phonepad("","39");
        System.out.println(phonep("", "39"));
    }
    static void phonepad(String p,String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit  = (int) (up.charAt(0) - '0');
        int inStRange = 0;
        int exEnRange = 0;
        if (digit<7) {
            inStRange = (digit -2)*3;
            exEnRange = (digit -1)*3; 
        }else if (digit == 7) {
            inStRange = (digit -2)*3;
            exEnRange = (digit -1)*3 + 1;
        }
        else if (digit == 8) {
            inStRange = (digit -2)*3 + 1;
            exEnRange = (digit -1)*3 +1;
        }
        else if (digit == 9) {
            inStRange = (digit -2)*3 +1;
            exEnRange = (digit -1)*3 +2;
        }
        for (int i = inStRange; i < exEnRange; i++) {
            char ch = (char)('a' + i );
            phonepad( p+ch, up.substring(1));
        }
    }
    static ArrayList<String> phonep(String p,String up){
        ArrayList<String> Ans = new ArrayList<>();
        if (up.isEmpty()) {
            Ans.add(p);
            return Ans;
        }

        int digit  = (int) (up.charAt(0) - '0');
        int inStRange = 0;
        int exEnRange = 0;
        if (digit<7) {
            inStRange = (digit -2)*3;
            exEnRange = (digit -1)*3; 
        }else if (digit == 7) {
            inStRange = (digit -2)*3;
            exEnRange = (digit -1)*3 + 1;
        }
        else if (digit == 8) {
            inStRange = (digit -2)*3 + 1;
            exEnRange = (digit -1)*3 +1;
        }
        else if (digit == 9) {
            inStRange = (digit -2)*3 +1;
            exEnRange = (digit -1)*3 +2;
        }
        for (int i = inStRange; i < exEnRange; i++) {
            char ch = (char)('a' + i );
            Ans.addAll(phonep( p+ch, up.substring(1)));
        }
        return Ans;
    }
    
}
