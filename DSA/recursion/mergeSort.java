package recursion;
import java.util.Arrays;;

public class mergeSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    static int[] mergeSort(int arr[]){
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length/2;

        int []left = mergeSort(Arrays.copyOfRange(arr,0, mid));
        int []right = mergeSort(Arrays.copyOfRange(arr,mid, arr.length));

        int result[] = merge(left, right);

        return result;
    }
    static int[] merge(int first[], int second[]){
        int res[] = new int[first.length + second.length];
        
        int i =0;
        int j =0;
        int k =0;

        while(i<first.length && j<second.length){
            if (first[i]<second[j]) {
                res[k++] = first[i++];
            }else{
                res[k++] = second[j++];
            }
        }
        while(i<first.length){
            res[k++] = first[i++];
        }
        while(j<second.length){
            res[k++] = second[j++];
         
        }
        return res;
    }

}
