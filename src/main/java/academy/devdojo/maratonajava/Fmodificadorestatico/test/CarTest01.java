package academy.devdojo.maratonajava.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.Fmodificadorestatico.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car01 = new Car("BMW", 280);
        Car car02 = new Car("Mercedes", 275);
        Car car03 = new Car("Audi", 290);


        car01.imprime();
        car02.imprime();
        car03.imprime();

        Car.setVelocidadeLimite(150);

        car01.imprime();
        car02.imprime();
        car03.imprime();
    }
}
