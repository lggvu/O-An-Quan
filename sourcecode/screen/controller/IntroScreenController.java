package sourcecode.screen.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import sourcecode.board.Board;
import sourcecode.player.Player;

import java.io.IOException;
import java.util.Optional;


public class IntroScreenController {
    private final Board board;
    private final Player player1;
    private final Player player2;
    public IntroScreenController (Board board, Player player1, Player player2) {
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
        try {
            final String HELP_SCREEN_FILE_PATH = "/sourcecode/screen/view/HelpScreen.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(HELP_SCREEN_FILE_PATH));
            fxmlLoader.setController(new HelpScreenController(board, player1, player2));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // set new scene for current stage
            stage.setScene(new Scene(root));
            stage.setTitle("Help Screen");
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    @FXML
    void btnExitGameClicked(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit Confirmation");
        alert.setHeaderText("Exit Game");
        alert.setContentText("Are you sure you want to exit?");
        Optional<ButtonType> res = alert.showAndWait();
        if(res.get() == ButtonType.OK) {
            // quit game
            Stage stage = (Stage) btnExitGame.getScene().getWindow();
            stage.close();
        } else {
            // close dialog
            alert.close();
        }

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

