package academy.devdojo.maratonajava.ZZHPadroesdeprojeto.test;

import academy.devdojo.maratonajava.ZZHPadroesdeprojeto.dominio.*;

public class ReportDtoTest01 {
    public static void main(String[] args) {

        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);

        Person person = Person.PersonBuilder.builder()
                .firstName("Rodrigo")
                .lastName("Felix")
                .build();


        ReportDto report = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();


        System.out.println(report);
    }
}
