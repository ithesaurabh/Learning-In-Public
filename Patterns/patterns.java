package Patterns;

public class patterns {
    public static void main(String[] args) {
        
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern28(5);
        System.out.println();
        pattern30(5);
        System.out.println();
        pattern17(5);
        System.out.println();
        pattern31(5);
        System.out.println();
    }
    static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        //easy technique
        // pattern2(n);
        // pattern3(n-1);

        //real technique
        for (int i = 1; i <= (2*n-1); i++) {
            int totalCols;
            if (i>n) {
                totalCols = n- ( i - n);
            }
            else totalCols = i;

            for (int j = 0; j < totalCols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for (int i = 0; i <= (2*n); i++) {
            int totalCols;
            if (i>n) {
                totalCols = n- ( i - n);
            }
            else totalCols = i;

            int noOfSpaces = n - totalCols;
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totalCols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for (int i = 1; i <= n; i++) {
            for (int spaces = 0; spaces < n-i ; spaces++) {
                System.out.print("  ");
            }

            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
            System.out.println();
        }
    }
    static void pattern17(int n){
        for (int i = 1; i < 2*n; i++) {

            int totalSpaces, startCols;
            
            if (i>n) {
                totalSpaces = i - n;
                startCols = 2*n - i; 
            }
            else{
                totalSpaces = n-i;
                startCols = i;
            } 
            
            for (int spaces = 1; spaces <=totalSpaces; spaces++) {
                System.out.print(" ");
            }

            for (int j = startCols; j > 0; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= startCols; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        for (int i = 1; i < 2*n; i++) {
            
        }
    }
}


