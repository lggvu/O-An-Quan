package sourcecode.gameplay;

import sourcecode.board.Board;
import sourcecode.board.Cell;
import sourcecode.player.Player;

public class GamePlay {
    public static void main(String[] args) {
        Board board = new Board();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        player1.setTurn(Math.random() < 0.5);
        if (player1.isInTurn()){
            GameStartWithPlayer1();
        }
    }
    public static void GameStartWithPlayer1(){
    	Player player1 = new Player("Player 1");
        while(player1.pickUpGemFrom(new Cell((int)(Math.random() * 11))) == false){
            System.out.print("Pick cell from another Cell");
        }
}
    



}
