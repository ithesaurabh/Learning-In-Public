package recursion;
import java.util.Arrays;

public class mergeSortInPlace {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInPlace(int arr[], int start, int end){
        if (end - start == 1) {
            return;
        }
        int mid = (end + start)/2;

        mergeSortInPlace(arr,start, mid);
        mergeSortInPlace(arr,mid, end);

        mergeInplace(arr,start,mid,end);

    }
    static void mergeInplace(int arr[], int start, int mid, int end){
        int res[] = new int[end - start];
        
        int i =start;
        int j =mid;
        int k =0;

        while(i<mid && j<end){
            if (arr[i]<arr[j]) {
                res[k++] = arr[i++];
            }
            else{
                res[k++] = arr[j++];
            }
        }
        while (i<mid) {
            res[k++] = arr[i++];
        }
        while (j<end) {
            res[k++] = arr[j++];
        }
        
        for (int l = 0; l < res.length; l++) {
            arr[start+l] = res[l];
        }
    }
}
