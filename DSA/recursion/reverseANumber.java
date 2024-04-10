public class reverseANumber {
    public static void main(String[] args) {
        int n = 1255;
        int digits = (int) Math.log10(n) + 1;
        System.out.println(reverseANumber(n, digits));
    }
    static int reverseANumber(int n, int arg) {
        if (n < 1 && arg < 1) {
            return 0;
        }
        return n % 10 * (int) Math.pow(10, --arg) + reverseANumber(n / 10, arg);
    }
}
