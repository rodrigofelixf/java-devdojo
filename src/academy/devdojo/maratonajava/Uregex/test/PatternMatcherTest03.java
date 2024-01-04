package academy.devdojo.maratonajava.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo que nao for digito
        // \s = Espacos em branco
        // \S = Todos os caracters excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = tudo o que nao for incluso no \w
        // [] - tudo que tiver dentro
        String regex = "0[xX][0-9a-f-A-F]";
        String text2 = "12 0x 0X 0xFFAVC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("text:   " + text2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " +regex);
        System.out.println("Find Positions");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
