package recursion;

public class binarySearch {
    public static void main(String[] args) {
            int[] arr= {1,9,91,550,599,670,1022,2366};
            
            int ans= binarySearch(arr, 0, arr.length-1, 550);
            System.out.println(ans);
    }
    static int binarySearch(int[] arr, int start, int end, int target){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(target==arr[mid]){
            return mid;
        }
        else if(target< arr[mid]){
            return binarySearch(arr, start, mid-1, target);
        }
        return binarySearch(arr, mid+1, end, target);
       
    }
}
