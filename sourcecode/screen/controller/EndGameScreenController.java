package sourcecode.screen.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.Optional;

public class EndGameScreenController {
    @FXML
    private Label winnerScore;

    @FXML
    private Button btnExit;

    @FXML
    void btnExitClicked(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit Confirmation");
        alert.setHeaderText("Exit Game");
        alert.setContentText("Are you sure you want to exit?");
        Optional<ButtonType> res = alert.showAndWait();
        if(res.get() == ButtonType.OK) {
            // quit game
            Stage stage = (Stage) btnExit.getScene().getWindow();
            stage.close();
        } else {
            // close dialog
            alert.close();
        }

    }
}
