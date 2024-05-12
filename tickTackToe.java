import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class tickTackToe {
    public static void main(String[] args) {
        
        //create a board
        char[][] board = new char[3][3];

        //Initialize it 
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = ' ';
            }
        }

        Scanner sc = new Scanner(System.in);
        char player = 'X';
        boolean isGameOver = false;

        while(!isGameOver){
            printBoard(board);
            
            System.out.println("Player " + player + " : ");

            int row = sc.nextInt();
            int col = sc.nextInt();

            System.out.println();
            if(board[row][col] == ' '){
                board[row][col] = player;
                if(hasWon(board,player)){
                    System.out.println("Player "+player+" has won the game!!");
                    printBoard(board);
                    isGameOver = true;
                }
                else{
                    if (player == 'X') {
                        player = 'O';
                    }
                    else{
                        player = 'X';
                    }
                }
            }else{
                if(boardFull(board)){
                    System.out.println("Unconcluded!!");
                    isGameOver = true;
                }
                System.out.println("Invalid move! try again..");
                continue;
            }

        }

        
    }

    private static boolean boardFull(char[][] board) {
        for (char[] cs : board) {
            for (char cs2 : cs) {
                if (cs2 == ' ') {
                    return false;
                }
            }   
        }
        return true;
    }

    private static boolean hasWon(char[][] board, char player) {
        //check for row
        for (int i = 0; i < board.length; i++) {
           if (board[i][0] == player && board[i][1]== player && board[i][2]==player) {
                return true;
           }
        }
        //check for col
        for (int i = 0; i < board.length; i++) {
           if (board[0][i] == player && board[1][i]== player && board[2][i]==player) {
                return true;
           }
        }

        //check diagonal
        if(board[0][0] == player && board[1][1] == player && board[2][2] ==  player){
            return true;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] ==  player){
            return true;
        }

        return false;
    }

    private static void printBoard(char[][] board) {
       
       for (char[] cs : board) {
        for (char cs2 : cs) {
            if (cs2 == ' ') {
                System.out.print(" | ");
            }
            else{
                System.out.print(" "+cs2+" ");
            }
        }
        System.out.println();
       }
       System.out.println();
    }
    
}
