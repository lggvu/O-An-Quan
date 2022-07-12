package sourcecode.screen.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import sourcecode.board.Board;
import sourcecode.player.Player;
import sourcecode.screen.controller.IntroScreenController;

import java.io.IOException;
import java.net.URISyntaxException;

public class IntroScreen extends Application {

    private static Board board;
    private static Player player1, player2;

    public void start(Stage primaryStage) {
//        music();

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

    MediaPlayer mediaPlayer;
    public void music() {
        Media media = null;
        try {
            media = new Media(getClass().getResource("/sourcecode/screen/music/gameMusic.mp3").toURI().toString());
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }


    public static void main(String[] args) {
        board = new Board();
        player1 = new Player("Player 1");
        player2 = new Player("Player2");

        launch(args);
    }
}
