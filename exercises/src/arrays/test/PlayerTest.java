package arrays.test;

import arrays.domain.Player;

public class PlayerTest {

    public static void main(String[] args) {
        Player player0 = new Player("Ronaldo");
        Player player1 = new Player("Messi");
        Player player2 = new Player("Neymar");

        Player[] players = new Player[]{player0,player1,player2};

        for (Player player: players) {
            player.print();

        }






    }
}
