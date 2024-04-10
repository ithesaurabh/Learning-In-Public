class printnto1{
    public static void main(String[] args) {
        printnto1(5);
    }
    static int printnto1(int n){
        if(n<1) return 0;
        System.out.println(n);

        return printnto1(n-1);
    }
}