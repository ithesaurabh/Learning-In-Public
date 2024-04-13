import java.util.ArrayList;


public class containsDuplicate {
    public static void main(String[] args) {
        int []nums = {1,2,3,1};
        // int []nums = {1,0,1,1};
        // int []nums = {1,2,3,1,2,3};
        int k = 3;
        System.out.println(containsDuplicate(nums, k));
    }
    static boolean containsDuplicate(int nums[], int k){
        /*Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k. */
        ArrayList<Integer> one = new ArrayList<>(); 

        for(int i= 0; i<nums.length; i++){
            if (one.contains(nums[i])) {
                int check = (i - one.indexOf(nums[i]));
                if (check<= k && check >=0) {
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
}
