package by.academy.Classwork6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("c*ab");
        Matcher matcher = pattern.matcher("cccccccccccccccccccab");
        boolean b = matcher.matches();
        System.out.println(b);
    }
}

