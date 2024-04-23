import java.util.HashSet;

public class happyNumber {
    public static void main(String[] args) {
        char ch = '6' ;
        int digit   =  (int) (ch + '0');
        System.out.println((char)(ch + '0'));
        System.out.println(digit);
        // System.out.println(isHappy(19));
    }
    static boolean isHappy(int num){
        HashSet<Integer> hashSet = new HashSet<>();
        int i=0;

        while (i<30) {
            int sum = 0;
            //taking number and dividing it;
            while (num>0) {
                sum += (int)Math.pow((num%10), 2);
                num = num/10; 
            }
            if (sum == 1) {
                    return true;
            }else if(hashSet.contains(sum)){
                return false;
            }else{
                hashSet.add(sum);
                num = sum;
                sum=0;
            }
        }
        System.out.println("I am done finding");
        System.out.println(hashSet);
        return false;
    }
}
