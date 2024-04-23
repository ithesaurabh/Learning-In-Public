import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {

        System.out.println(permutationsCount("", "abc"));
    }
    static void permutations(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int noOfRecCalls = p.length() +1;
        char ch = up.charAt(0);
        for (int i = 0; i < noOfRecCalls; i++) {
            String first = p.substring(0, i);
            String last = p.substring(i,p.length());
            permutations(first + ch + last, up.substring(1));
        }

    }
    static ArrayList<String> permutationsList(String p, String up){
        ArrayList<String> Answer = new ArrayList<>();
        
        if (up.isEmpty()) {
            Answer.add(p);
            return Answer;
        }
        int noOfRecCalls = p.length() +1;
        char ch = up.charAt(0);
        for (int i = 0; i < noOfRecCalls; i++) {
            String first = p.substring(0, i);
            String last = p.substring(i,p.length());
            Answer.addAll(permutationsList(first + ch + last, up.substring(1)));
        }
        return Answer;
    }

    static int permutationsCount(String p, String up){
        int count =0;
        if (up.isEmpty()) {
            System.out.println(p);
            return ++count;
        }
        int noOfRecCalls = p.length() +1;
        char ch = up.charAt(0);
        for (int i = 0; i < noOfRecCalls; i++) {
            String first = p.substring(0, i);
            String last = p.substring(i,p.length());
            count += permutationsCount(first + ch + last, up.substring(1));
        }
        return count;
    }
} 
