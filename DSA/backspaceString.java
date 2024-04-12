import java.util.ArrayList;

public class backspaceString {
    public static void main(String[] args) {
        String s = "ab#c", t = "ad#";
        // String s = "ab##", t = "c#d#";
        System.out.println(backspaceString(s, t));
    }
    static boolean backspaceString(String s, String t){
        ArrayList<Character> one = new ArrayList<>();
        ArrayList<Character> two = new ArrayList<>();
        int sizeS =s.length()-1;
        int sizeT =t.length()-1;
        int count = 1;
        while(sizeS>=0){
            if (s.charAt(sizeS) == 35) {
                if (s.charAt(sizeS -1) == 35 ) {
                    count++;
                    sizeS--;
                }
                else{
                    sizeS  = sizeS-(2*count);
                }
            }
            else{
                one.add(s.charAt(sizeS--));
            }
        }
        count = 1;
        while(sizeT>=0){
            if (t.charAt(sizeT) == 35) {
                if (t.charAt(sizeT -1) == 35 ) {
                    count++;
                    sizeT--;
                }
                else{
                    sizeT  = sizeT-(2*count);
                }
            }
            else{
                two.add(t.charAt(sizeT--));
            }
        }
        int i = one.size()-1;
        int j = two.size()-1;
        while(i>=0 && j>=0){
            if(one.get(i) == two.get(j)){
                i--;
                j--;
            }else{
                return false;
            };
        }
        if (i>0) {
            return false;
        }
        else if (j>0) {
            return false;
        }
        return true;
    }
}
