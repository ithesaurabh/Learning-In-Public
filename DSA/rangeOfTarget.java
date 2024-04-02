
public class rangeOfTarget {
    public static void main(String[] args) {
        int[] arr = {46,46,46,46,46,99,109,120};
        int target = 46;
        int[] ans = ans(arr, target);
        for(int el : ans){
            System.out.print(el + " ");
        }
    }
    static int[] ans(int[] arr, int target){
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        return new int[] {start, end};
    }
    static int search(int[] arr,int target, boolean startIndex){
        int start = 0,end = arr.length-1;
        int ans = -1;
        
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else{
                ans = mid;
                if(startIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }    
        }
        return ans;
    }
}
