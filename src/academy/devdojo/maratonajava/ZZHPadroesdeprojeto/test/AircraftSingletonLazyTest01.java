package academy.devdojo.maratonajava.ZZHPadroesdeprojeto.test;


import academy.devdojo.maratonajava.ZZHPadroesdeprojeto.dominio.AircraftSingletonEager;
import academy.devdojo.maratonajava.ZZHPadroesdeprojeto.dominio.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AircraftSingletonEager.getINSTANCE());
        System.out.println(AircraftSingletonEager.getINSTANCE());
        Constructor<AircraftSingletonLazy> constructor = AircraftSingletonLazy.class.getConstructor(String.class);
        constructor.setAccessible(true);
        AircraftSingletonLazy aircraftSingletonLazy = constructor.newInstance("787-900");
        System.out.println(aircraftSingletonLazy);

    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonLazy.getINSTANCE());
        AircraftSingletonLazy aircraftSingletonLazy = AircraftSingletonLazy.getINSTANCE();
        System.out.println(aircraftSingletonLazy.bookSeat(seat));
    }

}
