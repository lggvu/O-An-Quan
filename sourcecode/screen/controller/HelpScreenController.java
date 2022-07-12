package sourcecode.screen.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sourcecode.board.Board;
import sourcecode.player.Player;
import sourcecode.screen.controller.GamePlayScreenController;

import java.io.IOException;

public class HelpScreenController {
    private final Board board;
    private final Player player1;
    private final Player player2;

    public HelpScreenController(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

    @FXML
    private Button btnStartGame;

    @FXML
    private Button btnAccessHelp;

    @FXML
    private Button btnExitGame;

    @FXML
    void btnAccessHelpClicked(ActionEvent event) {

    }

    @FXML
    void btnExitGameClicked(ActionEvent event) {

    }

    @FXML
    void btnStartGameClicked(ActionEvent event) {
        try {
            final String PLAY_SCREEN_FILE_PATH = "/sourcecode/screen/view/PlayScreen.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PLAY_SCREEN_FILE_PATH));
            fxmlLoader.setController(new GamePlayScreenController(board, player1, player2));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // set new scene for current stage
            stage.setScene(new Scene(root));
            stage.setTitle("Play Screen");
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

}

