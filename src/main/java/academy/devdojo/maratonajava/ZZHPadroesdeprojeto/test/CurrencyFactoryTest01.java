package academy.devdojo.maratonajava.ZZHPadroesdeprojeto.test;

import academy.devdojo.maratonajava.ZZHPadroesdeprojeto.dominio.Country;
import academy.devdojo.maratonajava.ZZHPadroesdeprojeto.dominio.Currency;
import academy.devdojo.maratonajava.ZZHPadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
