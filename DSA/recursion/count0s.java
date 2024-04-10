public class count0s {
    public static void main(String[] args) {
        int num = 3010500;
        int ans = count0s(num,0);
        System.out.println(ans);
    }
    static int count0s(int n, int i){
        if(n<=1){
            return i;
        }
        else if(n%10==0){
            return count0s(n/10, ++i);
        }
        else{
            return count0s(n/10,i);
        }
    }
}
