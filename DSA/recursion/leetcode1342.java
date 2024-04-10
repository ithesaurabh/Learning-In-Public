public class leetcode1342 {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(steps(num, 0));
    }

    static int steps(int n, int i) {
        if (n == 0) {
            return i;
        }
        if (isEven(n)) {
            return steps(n / 2, ++i);
        } else {
            return steps(n - 1, ++i);
        }
    }
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
