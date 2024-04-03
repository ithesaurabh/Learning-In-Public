public class peakIndexInAMountainArray {
    public static void main(String[] args) {
        int arr[] = { 0, 10, 15, 2 };
        System.out.println(binarySearch(arr));
        System.out.println(binarySearch2(arr));
    }
    static int binarySearch(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid >= 0 && mid + 1 <= end) {
                if (arr[mid - 1] < arr[mid] && arr[mid + 1] < arr[mid]) {
                    return mid;
                } else if (arr[mid - 1] > arr[mid]) {
                    end = mid;
                } else {
                    start = mid;
                }
            }
        }
        return -1;
    }
    //From Kunal
    static int binarySearch2(int []arr){
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

}
