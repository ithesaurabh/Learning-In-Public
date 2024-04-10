public class print1toN {
    public static void main(String[] args) {
        print1toN(5);
    }
    static int print1toN(int n){
        if(n<1) return 0;
        print1toN(n-1);
        System.out.println(n);
        return 0;
    }
}
