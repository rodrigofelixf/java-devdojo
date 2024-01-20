package academy.devdojo.maratonajava.Zgenerics.services;

import academy.devdojo.maratonajava.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));

    public Carro buscarCarroDisponivel() {
        System.out.println("Buscando Carro Disponivel...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Carro alugado foi :" + carro);
        System.out.println("Carros disponiveis para alugar:");
        System.out.println(carrosDisponiveis);
        System.out.println("Devolvendo carro");
        return carro;
    }

    public void devolvendoCarro(Carro carro) {
        System.out.println("Devolvendo carro: " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros Disponiveis para Alugar");
        System.out.println(carrosDisponiveis);
    }





}
