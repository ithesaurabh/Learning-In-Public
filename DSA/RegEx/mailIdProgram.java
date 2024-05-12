package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mailIdProgram {
    public static void main(String[] args) {
        String regex = "[a-zA-Z0-9][a-zA-Z0-9_.]*[@][a-zA-Z0-9]+([.][a-zA-Z0-9]+)+";
        Pattern p = Pattern.compile(regex);
        Scanner sc = new Scanner(System.in);
        Matcher m = p.matcher(sc.next());
        
        if (m.matches()) {
            System.out.println("It is a valid mailId!!");
        }
        else{
            System.out.println("It is not a valid mailId.");
        }
    
    }
}