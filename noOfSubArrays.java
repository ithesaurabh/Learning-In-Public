/**
 * noOfSubArrays
 */
public class noOfSubArrays {

    public static void main(String[] args) {
        // int arr[] = {1,2,3};
        // int arr[] = {1,1,1};
        int arr[] = {1,-1,0};
        int k = 0;
        System.out.println(noOfSubArrays(arr, k));

    }
    static int noOfSubArrays(int []arr, int k){
        int count =0;
        int sum = 0;
        int i=0,j=0;
        while(j<arr.length && i<=j){
            sum += arr[j];
            if (arr[j] == k) {
                count++;
                sum = 0;
                i = j++;
            }else if (sum == k) {
                count ++ ;
                sum -= arr[i++];
                j++;
            }else if (sum > k) {
                sum -= arr[i++];
                j++;
            }else{
                j++;
            }
        }

        return count;
    }
}