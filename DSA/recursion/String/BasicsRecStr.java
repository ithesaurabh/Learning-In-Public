class BasicRecStr {
    public static void main(String[] args) {
        String s = "bcaapplecddsa";
        // Skip(s, "");
        System.out.println(SkipAppWhenNotApple(s));

    }

    static void Skip(String s, String updated) {
        if (s.isEmpty()) {
            System.out.println(updated);
            return;
        }
        if (s.charAt(0) == 'a') {
            Skip(s.substring(1), updated);
        } else {
            Skip(s.substring(1), updated + s.charAt(0));
        }
    }

    static String Skip2(String s) {
        String Ans;

        if (s.isEmpty()) {
            return "";
        }
        if (s.charAt(0) == 'a') {
            Ans = Skip2(s.substring(1));
            return Ans;
        } else {
            return s.charAt(0) + Skip2(s.substring(1));
        }

    }

    static String SkipApple(String s) {
        String Ans;

        if (s.isEmpty()) {
            return "";
        }
        if (s.startsWith("apple")) {
            Ans = SkipApple(s.substring(5));
            return Ans;
        } else {
            Ans = s.charAt(0) + SkipApple(s.substring(1));
            return Ans;
        }
    }
    static String SkipAppWhenNotApple(String s) {
        String Ans;

        if (s.isEmpty()) {
            return "";
        }
        if (s.startsWith("app") && !s.startsWith("apple")) {
            Ans = SkipAppWhenNotApple(s.substring(3));
            return Ans;
        } else {
            Ans = s.charAt(0) + SkipAppWhenNotApple(s.substring(1));
            return Ans;
        }
    }
}