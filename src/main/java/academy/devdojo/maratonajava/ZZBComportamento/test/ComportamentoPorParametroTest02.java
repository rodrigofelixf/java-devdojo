package academy.devdojo.maratonajava.ZZBComportamento.test;

import academy.devdojo.maratonajava.ZZBComportamento.dominio.Car;
import academy.devdojo.maratonajava.ZZBComportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("green", 2011), new Car("red", 2010), new Car("green", 2012));
        System.out.println(filter(cars, car -> car.getColor().equals("green")));
        System.out.println(filter(cars, car -> car.getYear() < 2015));

    }


    public static List<Car> filter(List<Car> carList, CarPredicate carPredicate) {
        List<Car> carFiltered = new ArrayList<>();
        for (Car car : carList) {
            if (carPredicate.test(car)) {
                carFiltered.add(car);
            }
        }
        return carFiltered;
    }


}
