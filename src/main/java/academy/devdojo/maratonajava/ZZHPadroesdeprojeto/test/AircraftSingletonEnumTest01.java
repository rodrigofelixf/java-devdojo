package academy.devdojo.maratonajava.ZZHPadroesdeprojeto.test;


import academy.devdojo.maratonajava.ZZHPadroesdeprojeto.dominio.AircraftSingletonEnum;
import academy.devdojo.maratonajava.ZZHPadroesdeprojeto.dominio.AircraftSingletonLazy;

import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");


    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum instance= AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }

}
