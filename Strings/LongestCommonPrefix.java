public class LongestCommonPrefix {
    public static void main(String[] args) {
    //   String  []strs = {"flower","flow","flight"};
       String  []strs = {"ab", "a"};
    //    String Ans = str[0].substring(0,matchedIndex);
    //    System.out.println(strs[0].length());
    System.out.println(longestCommonPrefix(strs));
    //    System.out.println(firstString);

    }
    static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int matchedIndex = 0;
        String firstString = strs[0];
        int i = 0;
        bahariloop: while (i<firstString.length()) {
            for (String element : strs) {
                if (element.length() > i && element.charAt(i) == firstString.charAt(i)) {
                    continue;
                }
                else break bahariloop;
            }
            matchedIndex++;
            i++;
        }
        String Ans = firstString.substring(0,matchedIndex);

        return Ans;
    }
}
