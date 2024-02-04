package academy.devdojo.maratonajava.Gassociacao.test;

import academy.devdojo.maratonajava.Gassociacao.dominio.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Pele");
        Player player2 = new Player("Neymar");
        Player player3 = new Player("Ronaldinho");
        Player[] players = {player1, player2, player3};

        for (Player player : players) {
            player.imprime();
        }


    }
}
