package recursion;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {5,10,6,8,8,25,20};
        System.out.println(returningList(arr, 8, 0));
    }
    static int linearSearch(int arr[], int target,int index){
    
        if(index == arr.length){
            return -1;
        } else if (arr[index] == target) {
            return index;
        }
        return linearSearch(arr, target, ++index);

    }
    static ArrayList<Integer> returningList(int arr[], int target, int i){
        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        list.addAll(returningList(arr, target, ++i));
        return  list;
    }
}
