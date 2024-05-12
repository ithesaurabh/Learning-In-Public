public class temp {
    public static void main(String[] args) {
        String s = "abcd";

        System.out.println(s.substring(1));
    }
    public boolean rotateString(String s, String goal) {
        int i = 0;
        String newS = s;
        while(i<s.length()){
            if((newS.substring(1)+s.charAt(i)) == goal){
                return true;
            }
            newS = newS.substring(1)+s.charAt(i);
            System.out.println(newS);
            i++;
        }
        return false;
    }

}
