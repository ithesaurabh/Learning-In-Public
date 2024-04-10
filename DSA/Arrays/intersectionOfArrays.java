import java.util.Arrays;
import java.util.HashSet;


public class intersectionOfArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,2,1};
        int arr2[] = {2,2};
        System.out.println(Arrays.toString(intersectionOfArrays(arr1, arr2)));
    }
    static int[] intersectionOfArrays(int nums1[], int nums2[]){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        

        for(int element : nums1){
            set1.add(element);
        }
        for(int element : nums2){
            if(set1.contains(element)){
                set2.add(element);
            }
        }
        int i = 0;
        int res[] = new int[set2.size()];
        for(int element : set2){
            res[i++] = element;
        }
        return res;
    }
}
