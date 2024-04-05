package Sorting;
import java.util.Arrays;

public class findMissingNum {
    public static void main(String[] args) {
        int[] arr= {9,6,4,2,3,5,7,0,1};
        int ans = cyclicSort(arr);
        System.out.println(ans);
    }
    static int cyclicSort(int[] arr){
        int i =0;
        while(i<arr.length){
            if(arr[i]<arr.length && arr[i] != i){
                int temp = arr[i];
                arr[i]=arr[temp];
                arr[temp] = temp;
            }
            else
            i++;
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
}
