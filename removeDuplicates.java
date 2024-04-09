import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        // int arr[] = {1,1,2};
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
    static int removeDuplicates(int arr[]){
        int i, j;
        i = 0;j=0;
        while(j<arr.length){
    
            if (arr[i] != arr[j]) {
                arr[++i] =  arr[j];
            }
            else{
                j++;
            }
        }
        return ++i;


    }
}
