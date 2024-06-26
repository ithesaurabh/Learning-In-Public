package Sorting;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        int res[] =  insertionSort(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
