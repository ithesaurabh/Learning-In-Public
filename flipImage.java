import java.util.Arrays;

public class flipImage {
    public static void main(String[] args) {
        int[][] image= { {1,1,0},{1,0,1},{0,0,0}};
        int[][] flippedImage = flipImage(image);


        for (int[] element : flippedImage) {
            System.out.println(Arrays.toString(element));
        }

    }
    static int[][] flipImage(int[][] arr){

        for (int[] row : arr) {
            //at first reverse the row
            for (int i = 0; i < (row.length +1)/2; i++) {
                int temp = row[i];
                row[i] = row[row.length - i-1];
                row[row.length - i-1] =  temp;
            }
            
            /*Got to know a new thing that for each loop doesn't let change the value of the element */
            // for (int element : row) {
            //     element = (element^1);
            // }
            
            // then inverse by xor operator
            for (int i = 0; i < row.length; i++) {
                row[i] = row[i]^1;
            }
        }
        return arr;
    }
}
