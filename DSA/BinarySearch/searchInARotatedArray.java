package BinarySearch;
public class searchInARotatedArray {
    public static void main(String[] args) {
        // int [] arr =  {4,5,6,7,8,1,2,3};
        // int [] arr =  {4,5,6,7,0,1,2};
        int [] arr =  {1,3};
        int target = 1;
        System.out.println(maxElement(arr));
        System.out.println(findTarget(arr, target));
        
        
    }
    static int findTarget(int[] arr, int target){
        int max = maxElement(arr);
        int start = 0,end = arr.length -1;
        if(arr[start]<target){
            end = max;
        }
        else if(arr[start] > target){
            start = max;
        }
        else return start;

        return binSearch(arr, target, start, end);
    }
    static int maxElement(int[] arr){
        int start =  0, end = arr.length -1;

        while(start<= end){
            int mid = start + (end - start)/2;
            
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(arr[start]<=arr[mid]){
                end = mid-1;
            }
            else start = mid+1;  
        }
        
        return -1;
    }
    static int binSearch(int[] arr, int target, int start,int end){
        while(start<=end){
            int mid = start + (end-start)/2;

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
