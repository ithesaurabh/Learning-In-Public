import java.util.*;

public class longestSubstring {
    public static void main(String[] args) {
        
    }
    static int longestSubstring(String s){
      
            // int count1 = 0;
            // int count2 = 0;
            // char[] array = s.toCharArray();
            // int i = 0;
            // while(array.length())
            return -1;

    }
    static boolean split(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int element : arr) {
            if (map.containsKey(element)) {
                int value = map.get(element);
                map.put(element, value+1);
            }
            else{
                map.put(element, 1);
            }
        }
        Collection<Integer> values = map.values();
        for (int value : values) {
            if (value>2) {
               return false;
            }
        }

        return true;
    }
}
