public class ithbit {
    public static void main(String[] args) {
        
    }
    static int findI(int num, int n){
        return num&(1<<(n-1));
    }
    static int setI(int num, int n){
        return num |(1<< (n-1));
    }
    static int resetI(int num, int n){
        int mask =(1<< (n-1));
        return num | (~mask);
    }

}
