package recursion;

import java.util.ArrayList;

public class backtracking {
    public static void main(String[] args) {
        Boolean [][]board = 
                        {
                            {true,true,true},
                            {true,false,true},
                            {true,true,true}
                        };
        System.out.println(mazeCount(3, 3));
        System.out.println(mazePath("",3, 3));
        System.out.println(mazePathIncDiagonal("",3, 3));
        System.out.println(mazePathIncDiagonalWithObstacles("",3, 3));
        System.out.println(mazePathAdv("",board,0, 0));
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
}
