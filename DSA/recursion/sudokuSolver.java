package recursion;

public class sudokuSolver {
    public static void main(String[] args) {
        int [][]question = 
        { 
        {3, 0, 6, 5, 0, 8, 4, 0, 0},
        {5, 2, 0, 0, 0, 0, 0, 0, 0},
        {0, 8, 7, 0, 0, 0, 0, 3, 1},
        {0, 0, 3, 0, 1, 0, 0, 8, 0},
        {9, 0, 0, 8, 6, 3, 0, 0, 5},
        {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
        {1, 3, 0, 0, 0, 0, 2, 5, 0},
        {0, 0, 0, 0, 0, 0, 0, 7, 4},
        {0, 0, 5, 2, 0, 6, 3, 0, 0} 
        };
    

        if(solve(question)){
            display(question);
        }else{
            System.out.println("Could not solve");
        }
    }
    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean noneEmpty = true;

        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    //found an empty  place
                    noneEmpty = false;
                    row = i;
                    col = j;
                    break;
                }
            }
            //if you found some empty elements then break;
            if (!noneEmpty) {
                break;
            }
        }
        
        //When you found none empty true then it means there is no empty place left and hence the sudoku is solved
            if (noneEmpty) {
                return true;
            }
        for (int i = 1; i <= 9; i++) {
            if (isSafe(board, row, col, i)) {
                board[row][col] = i;
                if(solve(board)){
                    //found the answer
                    return true;
                }else{
                    //backtrack
                    board[row][col] = 0;
                }
            }   
        }
        return false;
    }
    static void display(int[][] board){
        System.out.println();
        for (int[] row : board) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }


    static boolean isSafe(int[][] board, int row, int col, int number){
        //check if the number can be placed horizontally
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == number) {
                return false;
            }
        }
        //check if the number can be placed vertically
        for (int i = 0; i < board[0].length; i++) {
            if (board[i][col] == number) {
                return false;
            }
        }
        

        //now let's check for the sub-matrix
        int sqRoot = (int)Math.sqrt(board.length);
        int newR = row - (row%sqRoot);
        int newCol = col - (col%sqRoot);

        for (int i = newR; i < (newR+sqRoot); i++) {
            for (int j = newCol; j < (newCol+sqRoot); j++) {
                if (board[i][j] == number) {
                    return false;
                }
            }
        }
        return true;
    }
}
