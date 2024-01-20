package academy.devdojo.maratonajava.Zgenerics.services;

import academy.devdojo.maratonajava.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService <T> {

    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel() {
        System.out.println("Buscando objetoDisponivel...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Objeto alugado foi :" + t);
        System.out.println("Objetos disponiveis para alugar:");
        System.out.println(objetosDisponiveis);
        System.out.println("Devolvendo objeto");
        return t;
    }

    public void devolvendoObjeto(T t) {
        System.out.println("Devolvendo objeto: " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos Disponiveis para Alugar");
        System.out.println(objetosDisponiveis);
    }
}
