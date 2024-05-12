package recursion;

public class NQueens {
    public static void main(String[] args) {

        int n = 4;
        boolean [][]board = new boolean[n][n];
        System.out.println(queens(board, 0));
        
    }
    static int queens(boolean[][] board, int row){
        int count = 0;
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        // placing the queen and checking for the whole row and col
        for (int col = 0; col < board.length; col++) {
            //place if the position is safe
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }
    static void display(boolean[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]) {
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    static boolean isSafe(boolean[][] board, int row, int col){
        //checking  for the entire row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
      
        //check for left diagonal
        int minLeft = Math.min(row, col);
        for (int i = 1; i <= minLeft; i++) {
            if (board[row - i][col -i]) {
                return false;
            }
        }
        //check for right diagonal
        int minRight = Math.min(row, board.length - col-1);
        for (int i = 1; i <= minRight; i++) {
            if (board[row - i][col +i]) {
                return false;
            }
        }
        return true;    
    }
}
