import java.util.*;

public class subset {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        ArrayList<ArrayList<Integer>> res = subsetBasicusingForLoop(arr);

        for (ArrayList<Integer> arrayList : res) {
            System.out.println(arrayList);
        }
    }
    static void subseqBasic(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        // Hamare paas sirf 2 options hain. Yaa to lo, yaa to chood do simple😅😅

        //to pehle lete hain
        subseqBasic(p + up.charAt(0), up.substring(1));
        
        //ab chhod dete hain
        subseqBasic(p, up.substring(1));
        
    }
    static ArrayList<String> subseqBasic2(String p, String up){
        ArrayList<String> Ans = new ArrayList<>();
        if (up.isEmpty()) {
            // System.out.println(p);
            Ans.add(p);
            

            return Ans;
        }
        // Hamare paas sirf 2 options hain. Yaa to lo, yaa to chood do simple😅😅

        //to pehle lete hain
        Ans.addAll(subseqBasic2(p + up.charAt(0), up.substring(1)));
        
        //ab chhod dete hain
        Ans.addAll(subseqBasic2(p, up.substring(1)));
        
        return Ans;
    }
    static ArrayList<String> subseqBasicAscII(String p, String up){
        ArrayList<String> Ans = new ArrayList<>();
        if (up.isEmpty()) {
            // System.out.println(p);
            Ans.add(p);

            return Ans;
        }
        // Hamare paas sirf 2 options hain. Yaa to lo, yaa to chood do simple😅😅

        //to pehle lete hain
        Ans.addAll(subseqBasicAscII(p + up.charAt(0), up.substring(1)));
        
        //ab chhod dete hain
        Ans.addAll(subseqBasicAscII(p, up.substring(1)));
        

        //for ASCII
        Ans.addAll(subseqBasicAscII(p + (up.charAt(0)+0), up.substring(1)));

        return Ans;
    }
    static ArrayList<ArrayList<Integer>> subsetBasicusingForLoop(int[] arr){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for (int element : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(element);
                outer.add(inner);
            }    
        }
        return outer;
    }
    static ArrayList<ArrayList<Integer>> subsetBasicusingForLoopDuplicates(int[] arr){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for (int element : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(element);
                outer.add(inner);
            }    
        }
        return outer;
    }

}
