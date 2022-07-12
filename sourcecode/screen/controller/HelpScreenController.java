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

import java.io.IOException;

public class HelpScreenController {
    private final Board board;
    private final Player player1, player2;

    public HelpScreenController(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

    @FXML
    private Button btnBackFromHelpScreen;

    @FXML
    void btnBackFromHelpScreenClicked(ActionEvent event) {
        try {
            // TODO while playing: just a pop-up

            final String INTRO_SCREEN_FILE_PATH = "/sourcecode/screen/view/IntroScreen.fxml";
//            final String PLAY_SCREEN_FILE_PATH = "/sourcecode/screen/view/PlayScreen.fxml";

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(INTRO_SCREEN_FILE_PATH));
            fxmlLoader.setController(new IntroScreenController(board, player1, player2));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(root));
            stage.setTitle("Intro Screen");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
