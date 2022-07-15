package sourcecode;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import sourcecode.board.Board;
import sourcecode.player.Player;
import sourcecode.screen.controller.IntroScreenController;

import java.io.IOException;

public class Main extends Application {
    private static Board board;
    private static Player player1, player2;

    public void start(Stage primaryStage) {

        final String INTRO_SCREEN_FXML_FILE_PATH = "/sourcecode/screen/view/IntroScreen.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(INTRO_SCREEN_FXML_FILE_PATH));
        IntroScreenController IntroScreenController = new IntroScreenController(board, player1, player2);
        fxmlLoader.setController(IntroScreenController);
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
        player2 = new Player("Player2");

        launch(args);
    }

}
