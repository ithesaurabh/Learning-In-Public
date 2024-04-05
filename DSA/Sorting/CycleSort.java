package Sorting;
import java.util.Arrays;


public class CycleSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        int res[] =  cycleSort(arr);
        System.out.println(Arrays.toString(res));
    }
    static int[] cycleSort(int[] arr){
        int i = 0;
        while (i < arr.length-1) {
            if (arr[i] == i+1) {
                i++;
            }
            else{
                swap(arr, i, arr[i]-1);
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
