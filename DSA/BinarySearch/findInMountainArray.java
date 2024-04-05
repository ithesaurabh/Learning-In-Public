package BinarySearch;
public class findInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,6,3};
        int target = 6;
        System.out.println(findTarget(arr, target));
    }
    static int findTarget(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        int peak = peakIndex(arr);
        int ans = 0;
        
        ans = binarySearchInAsc(arr, target, start, peak);
        if(ans == -1){
             ans=binarySearchInDsc(arr, target, peak,end);
        }
        return ans;
    }
    static int peakIndex(int []arr){
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid >= 0 && mid + 1 <= end) {
                if (arr[mid + 1] < arr[mid]) {
                    //you  are in decreasing part of the array
                    //this may be the ans, but look in the left
                    end = mid;
                } else {
                    //you are in the asc part of  the array
                    start = mid+1;
                }
            }
        } 
        return start;
    }
    static int binarySearchInAsc(int[] arr, int target, int start, int end){
        
        // int start = 0,end = arr.length-1;
        
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
    static int binarySearchInDsc(int[] arr, int target, int start, int end){
        
        // int start = 0,end = arr.length-1;
        
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                start = mid+1;
            }
            else if(arr[mid] < target){
                end = mid-1;
            }  
        }
        
        return -1;
    }
}
//leetcode 1095 

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }

 
 class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
      int start = 0, end = arr.length() - 1;
        int peak = peakIndex(arr);
        int ans = 0;
        
        ans = binarySearchInAsc(arr, target, start, peak);
        if(ans == -1){
             ans=binarySearchInDsc(arr, target, peak,end);
        }
        return ans;
    }
    static int peakIndex(MountainArray arr) {
      int start = 0, end = arr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid >= 0 && mid + 1 <= end) {
                if (arr.get(mid + 1) < arr.get(mid)) {
                    //you  are in decreasing part of the array
                    //this may be the ans, but look in the left
                    end = mid;
                } else {
                    //you are in the asc part of  the array
                    start = mid+1;
                }
            }
        } 
        return start;
    }
    static int binarySearchInAsc(MountainArray arr, int target, int start, int end) {

        // int start = 0,end = arr.length-1;
        
        while(start<=end){

            int mid = start + (end - start)/2;
            int midval = arr.get(mid);
            if(midval == target){
                return mid;
            }
            else if(midval > target){
                end = mid-1;
            }
            else if(midval < target){
                start = mid+1;
            }  
        }
        
        return -1;
    }
    static int binarySearchInDsc(MountainArray arr, int target, int start, int end) {       
        while(start<=end){
            int mid = start + (end - start)/2;
            int midval = arr.get(mid);
            if(midval == target){
                return mid;
            }
            else if(midval > target){
                start = mid+1;
            }
            else if(midval< target){
                end = mid-1;
            }  
        }
        
        return -1;
    }
}
 */