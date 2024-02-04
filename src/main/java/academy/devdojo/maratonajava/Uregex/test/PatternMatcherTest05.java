package academy.devdojo.maratonajava.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . 1.3 = 123, 133, 1@3, 1A3
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, test@gmail.com, sakura@mail.com.br";
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
