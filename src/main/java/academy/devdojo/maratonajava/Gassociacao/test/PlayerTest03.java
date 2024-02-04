package academy.devdojo.maratonajava.Gassociacao.test;

import academy.devdojo.maratonajava.Gassociacao.dominio.Player;
import academy.devdojo.maratonajava.Gassociacao.dominio.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player = new Player("Cafu");
        Team team = new Team("Brasil");
        Player[] players = {player};


        player.setTeam(team);
        team.setPlayers(players);

        System.out.println("--- Player ---");
        player.imprime();
        System.out.println("--- Team ---");
        team.imprime();

    }
}
