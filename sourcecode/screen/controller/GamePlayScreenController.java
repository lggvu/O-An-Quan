package sourcecode.screen.controller;
import javafx.event.EventTarget;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import sourcecode.board.Board;
import sourcecode.player.Player;

import javax.swing.text.html.ImageView;

public class GamePlayScreenController {
	private Player player1, player2, currentPlayer;
	private Board board;

    public GamePlayScreenController(Board board, Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
    }

    @FXML
    private Label Player1Score;

    @FXML
    private Label Player2Score;

    @FXML
    private Pane cell1;

    @FXML
    private Label numOfGems1;

    @FXML
    private Pane cell2;

    @FXML
    private Label numOfGems2;

    @FXML
    private Pane cell3;

    @FXML
    private Label numOfGems3;

    @FXML
    private Pane cell4;

    @FXML
    private Label numOfGems4;

    @FXML
    private Pane cell5;

    @FXML
    private Label numOfGems5;

    @FXML
    private Pane cell7;

    @FXML
    private Label numOfGems7;

    @FXML
    private Pane cell8;

    @FXML
    private Label numOfGems8;

    @FXML
    private Pane cell9;

    @FXML
    private Label numOfGems9;

    @FXML
    private Pane cell10;

    @FXML
    private Label numOfGems10;

    @FXML
    private Pane cell11;

    @FXML
    private Label numOfGems11;

    @FXML
    private Label numOfGems0;

    @FXML
    private Label numofGems6;

    @FXML
    private Label player1Name;

    @FXML
    private Label player2Name;

    @FXML
    void cellChosen(MouseEvent event) {
        EventTarget paneChosen = event.getTarget();
        System.out.println(paneChosen);
        /*
        get the ImageView arrow and set it to visible
        switch to array mouse listener
         */
    }

    @FXML
    void leftDirectionChosen(MouseEvent event) {

    }

    @FXML
    void rightDirectionChosen(MouseEvent event) {

    }


}


