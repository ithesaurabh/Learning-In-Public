package Sorting;
import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args) {
        int[]arr={5,4,3,2,1}; 
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    
    }
    static void selectionSort(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int max = findMax(arr, start, end);
            int temp = arr[end];
            arr[end] = arr[max];
            arr[max] = temp;
            end--;
        }

    }

    static int findMax(int[] arr, int start, int end) {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                maxIndex = i;
                max = arr[i];
            }
        }
        return maxIndex;
    }
}