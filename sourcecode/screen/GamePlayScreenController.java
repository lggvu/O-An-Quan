package sourcecode.screen;


import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import sourcecode.board.Board;
import sourcecode.board.Cell;
import sourcecode.player.Player;

import static sourcecode.gameplay.GamePlay.GameStart;

public class GamePlayScreenController {
    private Cell currentCell;
    private Board board;
    private Player Player1;
    private Player Player2;

    private Player currentPlayer;


    @FXML
    void cellChosen(MouseEvent event) {


    }

    @FXML
    void leftDirectionChosen(MouseEvent event) {
        player1.spreadGem(currentCell, 1, board);

    }

    @FXML
    void rightDirectionChosen(MouseEvent event) {

    }

    public static void main(String[] args) {
        Board board = new Board();
        Player Player1 = new Player("Player 1");
        Player Player2 = new Player("Player 2");



        // TODO Add Introduction and rules here
        Player1.setTurn(Math.random() < 0.5); // math random???
        if (Player1.isInTurn()){
            currentPlayer = Player1;
            GameStart(Player1, Player2, board);
        } else {
            GameStart(Player2, Player1, board);
            System.out.println("Player 2 plays first");
        }

    }

}
