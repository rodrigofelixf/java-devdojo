package academy.devdojo.maratonajava.ZZBComportamento.test;

import academy.devdojo.maratonajava.ZZBComportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("green", 2011), new Car("red", 2010), new Car("green", 2012));

        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterYear(cars, 2015));

    }

    public static List<Car> filterCarByColor(List<Car> carList, String color) {
        List<Car> carFiltered = new ArrayList<>();
        for (Car car : carList) {
            if (car.getColor().equals(color)) {
                carFiltered.add(car);
            }
        }
        return carFiltered;
    }

    public static List<Car> filterYear(List<Car> carList, int year) {
        List<Car> carFiltered = new ArrayList<>();
        for (Car car : carList) {
            if (car.getYear() < year) {
                carFiltered.add(car);
            }
        }
        return carFiltered;
    }


}
