package sourcecode.screen.application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import jdk.internal.misc.TerminatingThreadLocal;
import sourcecode.board.Board;
import sourcecode.board.Cell;
import sourcecode.player.Player;
import sourcecode.screen.controller.GamePlayScreenController;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Optional;


public class GamePlayScreen extends Application {
    private static Board board;
    private static Player player1;
    private static Player player2;
//    private static String player1Name;
//    private static String player2Name;

    public void start(Stage primaryStage)
    {
        // the code below allow users to enter their player names before start the game
        /*
        // Avoid throwing IllegalStateException by running from a non-JavaFX thread.

        Platform.runLater(
                () -> {
                    TextInputDialog d1 = new TextInputDialog();
                    d1.setTitle("Enter Player 1 name");
                    Optional<String> res1 = d1.showAndWait();
                    res1.ifPresent(string -> player1Name = (String.valueOf(res1)));

                    TextInputDialog d2 = new TextInputDialog();
                    d2.setTitle("Enter Player 2 name");
                    Optional<String> res2 = d2.showAndWait();
                    res2.ifPresent(string -> player2.setName(String.valueOf(res2)));
                }
        );

         */
//        music();

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
    public void music() {
        Media media = null;
        try {
            media = new Media(getClass().getResource("/sourcecode/screen/music/gameMusic.mp3").toURI().toString());
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        MediaPlayer mediaPlayer;
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }


    public static void main(String[] args) {
        board = new Board();
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");



        launch(args);
    }

}
