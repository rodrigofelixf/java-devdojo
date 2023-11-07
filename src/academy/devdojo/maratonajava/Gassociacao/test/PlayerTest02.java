package academy.devdojo.maratonajava.Gassociacao.test;

import academy.devdojo.maratonajava.Gassociacao.dominio.Player;
import academy.devdojo.maratonajava.Gassociacao.dominio.Team;

import java.sql.Time;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Pele");
        player1.imprime();
        Team team = new Team("Selecao Brasileira");

        player1.setTeam(team);
        player1.imprime();


    }
}
