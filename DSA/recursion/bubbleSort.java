package recursion;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,4,7,50,203,2,1};
        bubbleSort(arr,arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int []arr, int i , int j){
     if (i ==0) {
        return;
     }
     if (j<i) {
        if (arr[j] > arr[j+1]) {
            //swap
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            bubbleSort(arr, i, ++j);
        }
        else{
            bubbleSort(arr, i, ++j);
        }
     }
     else{
        bubbleSort(arr, --i, 0);
     }


    }
}
