import java.util.ArrayList;

public class diceProblem {
    public static void main(String[] args) {
       System.out.println(dice("", 10, 6));
    };
    static ArrayList<String> dice(String p,int target, int face){
        ArrayList<String> Ans = new ArrayList<>();
        if (target <= 0) {
            Ans.add(p);
        }else{
            for (int i = 1; i<=face && i <= target; i++) {
                String s = String.valueOf(i);
                Ans.addAll(dice(p+s, target-i, face));
            }
        }
        return Ans;
    }
    static void dice2(String p,int target){
        if (target <= 0) {
           System.out.println(p);
        }else{

            for (int i = 1; i <= target; i++) {
                String s = String.valueOf(i);
                dice2(p+s, target-i);
            }
        }
    }
}
