package academy.devdojo.maratonajava.Zgenerics.test;

import academy.devdojo.maratonajava.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.Zgenerics.services.CarroRentavelService;
import academy.devdojo.maratonajava.Zgenerics.services.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Lancha")));

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);

        Carro carroAlugado = rentalServiceCarro.buscarObjetoDisponivel();
        rentalServiceCarro.devolvendoObjeto(carroAlugado);

        System.out.println("-----------");

        Barco barcoAlugado = rentalServiceBarco.buscarObjetoDisponivel();
        rentalServiceBarco.devolvendoObjeto(barcoAlugado);


    }
}
