public class oddEven {
    public static void main(String[] args) {
        int i = 11;
        System.out.println(isEven(i));
        
    }
    static boolean isEven(int n){
        return (n & 1) == 1;
    }
}
