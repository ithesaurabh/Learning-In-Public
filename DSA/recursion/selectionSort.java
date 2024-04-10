package recursion;

import java.util.Arrays;
public class selectionSort {
    public static void main(String[] args) {
        int  arr[] = {5,4,3,2,1};
        selectionSort(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int arr[], int i , int  j, int largest){
        if (i == 0) {
            return;
        }

        if (j<=i) {
            if (arr[j]>arr[largest]) {
                selectionSort(arr, i, j+1, j);
            }
            else{
                selectionSort(arr, i, ++j, largest);
            }
        }
        else{
            //swapping
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] =  temp;
            selectionSort(arr, --i, 0, 0);
        }
    }
}
