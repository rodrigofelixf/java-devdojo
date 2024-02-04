package academy.devdojo.maratonajava.SFormatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getNumberInstance();
        nfa[1] = NumberFormat.getNumberInstance(localeBR);
        nfa[2] = NumberFormat.getNumberInstance(localeIT);
        nfa[3] = NumberFormat.getNumberInstance(localeJP);

        double valores = 100_000.000;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valores));
        }
    }
}
