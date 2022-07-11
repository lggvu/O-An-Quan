package sourcecode.screen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sourcecode.board.Board;
import sourcecode.player.Player;
import sourcecode.screen.controller.GamePlayScreenController;

import java.io.IOException;


public class GamePlayScreen extends Application {
    private static Board board;
    private static Player player1;
    private static Player player2;

    public void start(Stage primaryStage)
    {
        final String STORE_FXML_FILE_PATH = "/sourcecode/screen/view/PlayScreen.fxml";  // TODO change this name
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
        GamePlayScreenController viewStoreController = new GamePlayScreenController(board, player1, player2);
        fxmlLoader.setController(viewStoreController);
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        primaryStage.setTitle("O An Quan");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    public static void main(String[] args) {
        board = new Board();
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");

        launch(args);
    }

}
