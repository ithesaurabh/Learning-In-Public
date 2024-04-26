package recursion;

import java.util.*;

public class backtracking {
    public static void main(String[] args) {
        Boolean [][]board = 
                        {
                            {true,true,true},
                            {true,true,true},
                            {true,true,true}
                        };

int[][] path = new int[board.length][board[0].length];
        // System.out.println(mazeCount(3, 3));
        // System.out.println(mazePath("",3, 3));
        // System.out.println(mazePathIncDiagonal("",3, 3));
        // System.out.println(mazePathIncDiagonalWithObstacles("",3, 3));
        // System.out.println(mazePathAdv("",board,0, 0));
       
        // System.out.println(mazePathBacktracking("",board,0, 0));
        mazePathBacktrackingAllAns("",board,3,3,path,1);
    }
    static int mazeCount(int r, int c){
        int count = 0;
        if (r == 1 || c == 1) {
            return 1;
        }
        count += mazeCount(r-1, c);
        count += mazeCount(r, c-1);
        // int left =  mazeCount(r-1, c);
        // int right =  mazeCount(r, c-1);
        
        return count;
    }
    static ArrayList<String> mazePath(String p,int r, int c){
        ArrayList<String> Ans = new ArrayList<>();
        if (r<1 || c<1) {
            return Ans;
        }
        if (r == 1 && c == 1) {
            Ans.add(p);
            return Ans;
        }
        
        Ans.addAll(mazePath(p + 'D',r-1, c));
        Ans.addAll(mazePath(p + 'R',r, c-1));
        
        return Ans;
    }
    static ArrayList<String> mazePathIncDiagonal(String p,int r, int c){
        ArrayList<String> Ans = new ArrayList<>();
        if (r<1 || c<1) {
            return Ans;
        }
        if (r == 1 && c == 1) {
            Ans.add(p);
            return Ans;
        }
        
        Ans.addAll(mazePathIncDiagonal(p + 'D',r-1, c));
        Ans.addAll(mazePathIncDiagonal(p + 'R',r, c-1));
        Ans.addAll(mazePathIncDiagonal(p + 'd',r-1, c-1));
        
        return Ans;
    }
    static ArrayList<String> mazePathIncDiagonalWithObstacles(String p,int r, int c){
        ArrayList<String> Ans = new ArrayList<>();
        

        //❤️❤️
        //locating obstacles 
        //river at [2,2]
        if (r == 2 && c == 2) {
            return Ans;
        }

        if (r<1 || c<1) {
            return Ans;
        }
        if (r == 1 && c == 1) {
            Ans.add(p);
            return Ans;
        }
        
        Ans.addAll(mazePathIncDiagonalWithObstacles(p + 'D',r-1, c));
        Ans.addAll(mazePathIncDiagonalWithObstacles(p + 'R',r, c-1));
        Ans.addAll(mazePathIncDiagonalWithObstacles(p + 'd',r-1, c-1));
        
        return Ans;
    }
    static ArrayList<String> mazePathAdv(String p,Boolean maze[][],int r, int c){
        ArrayList<String> Ans = new ArrayList<>();
        if (r == maze.length -1 && c == maze[0].length-1 ) {
            Ans.add(p);
            return Ans;
        }
        if (r>maze.length -1 || c>maze[0].length-1) {
            return Ans;
        }
        if (!maze[r][c]) {
            return Ans;
        }else{
            Ans.addAll(mazePathAdv(p + 'V',maze,r+1, c));
            Ans.addAll(mazePathAdv(p + 'H',maze,r, c+1));
            Ans.addAll(mazePathAdv(p + 'D',maze,r+1, c+1));
        }
        return Ans;
    }
    static ArrayList<String> mazePathBacktracking(String p,Boolean maze[][],int r, int c){
        ArrayList<String> Ans = new ArrayList<>();
        if (r == maze.length -1 && c == maze[0].length-1 ) {
            Ans.add(p);
            return Ans;
        }
        if (r>maze.length -1 || c>maze[0].length-1 || c<0 || r<0) {
            return Ans;
        }
        if (!maze[r][c]) {
            return Ans;
        }else{
            maze[r][c] = false;
            Ans.addAll(mazePathBacktracking(p + 'D',maze,r+1, c));
            Ans.addAll(mazePathBacktracking(p + 'U',maze,r-1, c));
            Ans.addAll(mazePathBacktracking(p + 'R',maze,r, c+1));
            Ans.addAll(mazePathBacktracking(p + 'L',maze,r, c-1));
            maze[r][c] = true;
        }
        return Ans;
    }
    static void mazePathBacktrackingAllAns(String p,Boolean maze[][],int r, int c, int[][] mazeP, int step){
        
        if (r == maze.length -1 && c == maze[0].length-1 ) {
            mazeP[r][c] = step;
            for (int[] ele : mazeP) {
                System.out.println(Arrays.toString(ele));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (r>maze.length -1 || c>maze[0].length-1 || c<0 || r<0) {
            return;
        }
        if (!maze[r][c]) {
            return;
        }else{
            maze[r][c] = false;
            mazeP[r][c] = step;
            mazePathBacktrackingAllAns(p + 'D',maze,r+1, c, mazeP,  step+1);
            mazePathBacktrackingAllAns(p + 'U',maze,r-1, c, mazeP,  step+1);
            mazePathBacktrackingAllAns(p + 'R',maze,r, c+1, mazeP,  step+1);
            mazePathBacktrackingAllAns(p + 'L',maze,r, c-1, mazeP,  step+1);
            mazeP[r][c] = 0;
            maze[r][c] = true;
        }
        return ;
    }
  
}
