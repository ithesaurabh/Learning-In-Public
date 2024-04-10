public class palindrome {
    public static void main(String[] args) {
        int n = 1331;
        System.out.println(checkPalindrome(n));
    }
    
    static boolean checkPalindrome(int n){
        int digits = (int) Math.log10(n) + 1;
        return n==reverseANumber(n, digits);
    }
    static int reverseANumber(int n, int arg) {
        if (n < 1 && arg < 1) {
            return 0;
        }
        return n % 10 * (int) Math.pow(10, --arg) + reverseANumber(n / 10, arg);
    }
}
