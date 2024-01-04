package academy.devdojo.maratonajava.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo que nao for digito
        // \s = Espacos em branco
        // \S = Todos os caracters excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = tudo o que nao for incluso no \w
        // [] - tudo que tiver dentro
        // ? - Zero ou uma
        // * zero ou mais
        // + um ou mais
        // {n,m} de n ate m
        // () agrupa
        // | um ou outro
        // $ fim da linha
        // .
        String regex = "0[xX]([0-9a-f-A-F])+(\\s|$)";
        String text = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text:   " + text);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " +regex);
        System.out.println("Find Positions");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
