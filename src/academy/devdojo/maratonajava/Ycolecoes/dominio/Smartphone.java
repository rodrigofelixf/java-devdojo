package academy.devdojo.maratonajava.Ycolecoes.dominio;

import java.util.Objects;

public class Smartphone implements Comparable<Smartphone> {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }


    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Smartphone smartphone = (Smartphone) obj;

        // Verificar se ambos os serialNumbers são não nulos antes de chamar equals
        return Objects.equals(serialNumber, smartphone.serialNumber);
    }


    // se x.equals(y) == true, y.hashCode() == x.hashCode()
    // y.hashCode() == x.hashCode() nao necessariamente o equals de y.equals(x) tem que ser true
    // x.equals(y) == false
    // y.hashCode() != x.hashCode() x.equals(y) devera ser false.

    // se o serialNumber retornar null, tem que ser 0 por padrao da implementacao
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }


    @Override
    public int compareTo(Smartphone obj) {
        return this.serialNumber.compareTo(obj.getSerialNumber());
    }
}
