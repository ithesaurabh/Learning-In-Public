import java.util.Arrays;

import Sorting.selectionSort;

public class removeElement {
    public static void main(String[] args) {
        int arr[] = {0,1,2,2,3,0,4,2};
        // int arr[] = {3,2,2,3};
        System.out.println(removeElement(arr, 2));
        System.out.println(Arrays.toString(arr));
    }
    static int removeElement(int []arr, int val){
       Arrays.sort(arr);

       int i = 0;
       int j = arr.length-1;
       int count = 0;
       while(i<=j){
        if (arr[i] == val) {
            swap(arr, i, j);
            i++;
            j--;
            count ++;
        }
        else i++;
       }
       return arr.length - count;
    }
    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
