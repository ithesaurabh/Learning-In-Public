public class magicNumber {
    public static void main(String[] args) {
        int lastDigit, number = 1;
        int count = 1;
        int ans = 0;
        while (number>0) {
            lastDigit = number&1;
            if (lastDigit == 1) {
                ans += Math.pow(5, count);
            }
            count++;
            number = number>>1;
        }
        System.out.println(ans);
    }
}
