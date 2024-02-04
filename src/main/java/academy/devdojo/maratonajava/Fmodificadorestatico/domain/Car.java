package academy.devdojo.maratonajava.Fmodificadorestatico.domain;

public class Car {
    private String name;
    private double maxSpeed;
    private static  double limitSpeed = 250;


    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;

    }

    public void imprime(){
        System.out.println("---------------");
        System.out.println("name " + this.name);
        System.out.println("max speed " + this.maxSpeed);
        System.out.println("limit speed " + this.limitSpeed);


    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Car.limitSpeed = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return limitSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getLimitSpeed() {
        return limitSpeed;
    }

    public void setLimitSpeed(double limitSpeed) {
        this.limitSpeed = limitSpeed;
    }
}
