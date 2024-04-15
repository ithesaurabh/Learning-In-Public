public class isPowerOfTwo {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(isPowerOfTwo(num));
    }
    static boolean isPowerOfTwo(int num){
        if ((num & (num-1) )== 0) {
            return true;
        }

        return false;
    }
}
