
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class StopSign extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
    	int width=400,height=400;
    	double radius=width*0.4;
        StackPane pane = new StackPane();
        Polygon polygon = new Polygon();
        polygon.setFill(Color.RED);
        polygon.setStroke(Color.RED);
        ObservableList<Double> points = polygon.getPoints();
        // adding the points based on width and height
        for (int i = 0; i < 8; i++) {
            points.add(width/2 + radius* Math.cos(Math.toRadians(i * 45 + 45 / 2)));
            points.add(height/2 - radius* Math.sin(Math.toRadians(i * 45 + 45 / 2)));
        }
        polygon.setRotate(0);
        //writing the text
        Text text = new Text("STOP");
        text.setFont(Font.font(100));
        text.setFill(Color.WHITE);

        pane.getChildren().addAll(polygon, text);
        Scene scene = new Scene(pane, width, height);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Stop Sign");
        primaryStage.show();
    }
    public static void main(String[] args) {

        Application.launch(args);

    }
}