import java.util.Arrays;

import Sorting.selectionSort;

public class removeElement {
    public static void main(String[] args) {
        int arr[] = {0,1,2,2,3,0,4,2};
        // int arr[] = {0,1,2,2,3,0,4,2};
        // int arr[] = {3,2,2,3};
        System.out.println(removeElement(arr, 2));
        System.out.println(Arrays.toString(arr));
    }
    static int removeElement(int []arr, int val){
       int j = 0;
       int count = 0;
       while (j<arr.length) {
       if (arr[j] != val) {
        arr[count++] = arr[j++];
       }
       else{
        j++;
       }
       }
        return count;
    }
    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
