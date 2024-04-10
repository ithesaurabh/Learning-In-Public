public class sumOfDigits {
    public static void main(String[] args) {
       System.out.println(sumOfDigits(1233355));
    }
    static int sumOfDigits(int n){
        if (n<1) {
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
}
