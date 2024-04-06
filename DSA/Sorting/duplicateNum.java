package Sorting;


public class duplicateNum {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,2,1};
        int ans = cyclicSort(arr);
        System.out.println(ans);
    }
    static int cyclicSort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] -1;
            if( arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else i++;
        }
        return arr[arr.length-1];
    }
    static void swap(int[]  arr, int p1, int p2){
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
