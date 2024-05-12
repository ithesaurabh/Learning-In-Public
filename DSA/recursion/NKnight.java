package recursion;

public class NKnight {
    public static void main(String[] args) {
        int n = 4;
        boolean board[][] = new boolean[n][n];
        knights(board, 0, 0, n);
    }
    static void knights(boolean [][]board, int row, int col, int knights){
        if (knights ==0) {
                display(board);
                System.out.println();
                return;
        }  
        if (row == board.length && col == board[0].length ) {
            return;
        } 
        if (col == board.length) {
            knights(board, row+1,0,knights);
            return;
        }
        if (row == board.length) {
            return;
        }
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knights(board, row, col+1, knights-1);
            board[row][col] = false;
        }
        knights(board, row, col+1, knights);
        
        return;

    }
    static boolean isSafe(boolean board[][], int row, int col){
        if (isValidIndex(row-2, col-1, board)) {
            if (board[row-2][col-1]) {
                return false;
            }
        }
        if (isValidIndex(row-2, col+1, board)) {
            if (board[row-2][col+1]) {
                return false;
            }
        }
        if (isValidIndex(row-1, col+2, board)) {
            if (board[row-1][col+2]) {
                return false;
            }
        }
        if (isValidIndex(row-1, col-2, board)) {
            if (board[row-1][col-2]) {
                return false;
            }
        }
        return true;
    }
    static boolean isValidIndex(int row, int col, boolean[][] board){
        return (row>=0 && row<board.length && col >=0 && col<board.length);
    }

    static void display(boolean[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]) {
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
