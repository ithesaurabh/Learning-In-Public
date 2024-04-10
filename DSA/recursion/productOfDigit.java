class productOfDigit{
    public static void main(String[] args) {
        System.out.println(productOfDigit(123));
    }
    static int productOfDigit(int n){
        if(n%10 == n){
            return n;
        }

        return n%10 * productOfDigit(n/10);
    }
}