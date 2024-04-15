import java.util.ArrayList;
import java.util.HashMap;


public class containsDuplicate {
    public static void main(String[] args) {
        int []nums = {1,2,3,1};
        // int []nums = {1,0,1,1};
        // int []nums = {1,2,3,1,2,3};
        int k = 3;
        System.out.println(containsDuplicateOptimized(nums, k));
    }
    static boolean containsDuplicate(int nums[], int k){
        /*Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k. */
        ArrayList<Integer> one = new ArrayList<>(); 

        for(int i= 0; i<nums.length; i++){
            if (one.contains(nums[i])) {
                int check = (i - one.indexOf(nums[i]));
                int check2 = (one.indexOf(nums[i]) - i);

                if ((check<= k && check >=0) ||( check2<=k && check2>= 0)) {
                    return true;
                }
                else{
                    one.set(one.indexOf(nums[i]), null);
                    one.add(nums[i]);
                }
            }
            else{
                one.add(nums[i]);
            }
        }

        System.out.println(one);
        return false;
    }
    static boolean containsDuplicateOptimized(int arr[], int k){
        HashMap<Integer, Integer> one = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (one.containsKey(arr[i])) {
                if (Math.abs(one.get(arr[i]) -i) <= k) {
                    return true;
                }
                else{
                    one.put(arr[i],i);
                }
            }
            else{
                one.put(arr[i],i);
            }
        }
        return false;
    }
}
