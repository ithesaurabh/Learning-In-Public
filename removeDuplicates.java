import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        // int arr[] = {1,1,2};
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
    static int removeDuplicates(int arr[]){
        int count=0;
        int prev = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[prev] == arr[i]) {
                swap(arr, i, i+1);
                i--;
                count++;
            }
            prev= i;
        }
     return arr.length - count;   
    }
    static void swap(int arr[], int  a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
