package BinarySearch;
public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {12,15,45,46,78,98,99,109,120};
        int target = 111;

        System.out.println(CeilingOfTheNumber(arr,target));
    }
    static int CeilingOfTheNumber(int []arr, int target){
        int start = 0, end = arr.length -1;
        int lastIndex = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                start = mid +1;
            }
            else {
                end = mid -1;
            }
            lastIndex = mid;
        }
        return arr[lastIndex];
    }
}
