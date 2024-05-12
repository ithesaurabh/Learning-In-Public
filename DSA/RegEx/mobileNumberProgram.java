package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mobileNumberProgram {
    public static void main(String[] args) {
        String regex = "(0|91)?[6-9][0-9]{9}";
        Pattern p = Pattern.compile(regex);
        Scanner sc = new Scanner(System.in);
        Matcher m = p.matcher(sc.next());
        
        if (m.matches()) {
            System.out.println("It is a valid number!!");
        }
        else{
            System.out.println("It is not a valid number.");
        }
    }
}
