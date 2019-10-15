package Oct16;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Email extends Application {

/**

   * Launches the email application.

   *

   * @param primaryStage

   * a Stage

   */

public void start(Stage primaryStage) {

final int appWidth = 700; // width of the pop-up window.

final int appHeight = 500; // height of the pop-up window.

Scene scene = new Scene();

primaryStage.setTitle("Email"); // title of the window.

primaryStage.setScene(scene);

primaryStage.show();

}

/**

   * Launches the JavaFX application.

   *

   * @param args

   * command line arguments

   */

public static void main(String[] args) {

launch(args);

}

}