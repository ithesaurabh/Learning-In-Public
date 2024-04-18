public class myAtoiString {
    public static void main(String[] args) {
        String s = "   -42";
        System.out.println(myAtoi(s));
    }
    static int myAtoi(String s){
        String newString = s.replaceAll("\\s", "");
        char str[] = newString.toCharArray();
        StringBuilder ans = new StringBuilder();
        int index = 0;
        boolean isPositve = true;
        if (str[0] == '-') {
            isPositve = false;
        }
        while (index < str.length) {
            if (Character.isDigit(str[index])) {
                ans.append(str[index]);
            } else {
                break;
            }
            index++;
        }
        
        int number = Integer.parseInt(ans.toString());
        
        if (isPositve) {
            if (number < 2147483648L && number >= 0) {
                return number;
            }
        } else {
            if (number >= -2147483648L && number < 0) {
                return -number;
            }
        }
        
        return -1;
    }
}
