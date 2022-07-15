package sourcecode.screen.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import sourcecode.board.Board;
import sourcecode.player.Player;
import sourcecode.screen.controller.HelpScreenController;

import java.io.IOException;

public class HelpScreen extends Application {
    private static Board board;
    private static Player player1, player2;

    public void start(Stage primaryStage) {
        final String HELP_SCREEN_FXML_FILE_PATH = "/sourcecode/screen/view/HelpScreen.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(HELP_SCREEN_FXML_FILE_PATH));
        HelpScreenController helpScreenController = new HelpScreenController(board, player1, player2);
        fxmlLoader.setController(helpScreenController);
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image icon = new Image("/sourcecode/screen/images/icon.png");
        primaryStage.getIcons().add(icon);
        primaryStage.setResizable(false);

        primaryStage.setTitle("O An Quan - Instructions");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        board = new Board();
        player1 = new Player("Player 1");
        player2 = new Player("Player2");

        launch(args);
    }
}
