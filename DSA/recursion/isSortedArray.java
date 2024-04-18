package recursion;

public class isSortedArray {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5};
        int arr[] = {5,4,3,2,1};
        System.out.println(isSortedArray(arr, 0));
    }
    static boolean isSortedArray(int arr[], int i){
        if (i== arr.length -1) {
            return true;
        }
        else{
            return arr[i] <= arr[i+1] && isSortedArray(arr, ++i);
        }
    }
}
