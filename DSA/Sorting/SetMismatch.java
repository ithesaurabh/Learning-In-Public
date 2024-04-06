package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1, 3 };
        int[] res = missingArr(arr);
        System.out.println(Arrays.toString(res));
        System.out.println("done");
    }
    static int[] missingArr(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
            // System.out.println(i);
        }
        int[] arr2 = new int[2];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                arr2[0] = arr[j];
                arr2[1] = j + 1;
            }
        }
        return arr2;
    }
}
