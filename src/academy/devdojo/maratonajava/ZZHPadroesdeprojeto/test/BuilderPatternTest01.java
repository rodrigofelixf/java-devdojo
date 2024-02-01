package academy.devdojo.maratonajava.ZZHPadroesdeprojeto.test;

import academy.devdojo.maratonajava.ZZHPadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Rodrigo")
                .lastName("Felix")
                .userName("JavaGod")
                .build();

        printPerson(build);


    }



    public static void printPerson(Person person) {
        System.out.println(person);
    }
}
