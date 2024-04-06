package Sorting;

public class MissingPositiveNum {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 1 ,-1};
        // int[] arr = {7,8,9,11,12};
        // int[] arr = {2};
        // int[] arr = { -1, -2, -60, 40, 43 };
        int ans = findPositiveMissingNum(arr);
        System.out.println(ans);
    }
    static int findPositiveMissingNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (correct < arr.length && correct >= 0 && arr[i] != arr[correct] ) {
                swap(arr, i, correct);
            } 
            else i++;
    }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }
        return arr.length + 1;
    }

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
