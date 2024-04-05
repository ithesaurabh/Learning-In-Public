package BinarySearch;
//Find an element without using Arr.length

public class PosOfNumInInfiniteArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 5, 7, 8, 10, 15, 17, 19, 20, 25, 29, 35 };
        int target = 100;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = 5;
        boolean boundaryNotFound = true;
        // let's assume the size is 5 initially
        while (boundaryNotFound) {
            try {
                if (arr[end] >= target) {
                    boundaryNotFound = false;
                } else if (arr[end] < Integer.MIN_VALUE) {
                    end = end / 2;
                } else {
                    start = end + 1;
                    end = end * 3;
                }
            } catch (Exception error) {
                if (error instanceof ArrayIndexOutOfBoundsException) {
                    System.err.println("Error: Index out of bounds");
                } else {
                    throw error; // Rethrow any other type of error
                }
            }
        
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }
}