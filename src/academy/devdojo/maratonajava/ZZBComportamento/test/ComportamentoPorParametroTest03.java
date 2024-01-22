package academy.devdojo.maratonajava.ZZBComportamento.test;

import academy.devdojo.maratonajava.ZZBComportamento.dominio.Car;
import academy.devdojo.maratonajava.ZZBComportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("green", 2011), new Car("red", 2010), new Car("green", 2012));
        System.out.println(filter(cars, car -> car.getColor().equals("green")));
        System.out.println(filter(cars, car -> car.getYear() < 2015));
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(numbers, number -> number % 2 == 0));

    }


    private static<T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filterList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filterList.add(e);
            }
        }
        return filterList;
    }


}
