public class nonDuplicate {
    public static void main(String[] args) {
        int arr[] = {5,4,3,6,2,1,2,6,5,4,3};
        System.out.println(nonDuplicate(arr));
    }
    static int nonDuplicate(int arr[]){
        int unique = 0;
        for (int i : arr) {
            unique ^=i; 
        }
        return unique;
    }
}
