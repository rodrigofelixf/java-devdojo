package academy.devdojo.maratonajava.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
        String text2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("text:   " + text2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " +regex);
        System.out.println("Find Positions");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
