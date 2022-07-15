package sourcecode.screen.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import sourcecode.board.Board;
import sourcecode.player.Player;
import sourcecode.screen.controller.GamePlayScreenController;

import java.io.IOException;


public class GamePlayScreen extends Application {
    private static Board board;
    private static Player player1;
    private static Player player2;

    public void start(Stage primaryStage) {
        final String PLAY_SCREEN_FXML_FILE_PATH = "/sourcecode/screen/view/PlayScreen.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PLAY_SCREEN_FXML_FILE_PATH));
        GamePlayScreenController gamePlayScreenController = new GamePlayScreenController(board, player1, player2);
        fxmlLoader.setController(gamePlayScreenController);
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image icon = new Image("/sourcecode/screen/images/icon.png");
        primaryStage.getIcons().add(icon);
        primaryStage.setResizable(false);

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
