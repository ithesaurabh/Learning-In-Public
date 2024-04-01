public class binarySearch{
    public static void main(String[] args) {
        int[] arr = {12,15,45,46,78,98,99,109,120};
        int target = 45;
        System.out.println(Binarysearch(arr, target));

    }
    static int Binarysearch(int[] arr, int target){
        
        int start = 0,end = arr.length;
        
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }  
        }
        return -1;
    }
}