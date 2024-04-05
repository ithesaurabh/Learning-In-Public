package Sorting;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class numsDisappearedInArray {
    public static void main(String[] args) {
        int[] arr= {4,3,2,7,8,2,3,1}; //[1,2,3,4,2,3,7,8]
        List<Integer> list =  missingArr(arr);
        System.out.println(list);
    }
    static List<Integer> missingArr(int[] arr){
        int i =0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i]=arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
            // System.out.println(i);
        }
        System.out.println(Arrays.toString(arr));
        List<Integer> list = new ArrayList<>(2);
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                list.add(j+1);
            }
        }
        return list;
    }
}
// for (int i = 0; i < arr.length; i++) {
//             int correct=arr[i]-1;
//             if(arr[i]!=arr[correct]){
//                 int temp=arr[i];
//                 arr[i]=arr[correct];
//                 arr[correct]=temp;
//                 i--;
//             }