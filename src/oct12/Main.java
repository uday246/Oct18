package oct12;


import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JPanel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        FlowPane pane = new FlowPane();
        Parent pane2 = new JPanel();
        JButton button = new JButton();
        Label name = new Label("Name:");
        name.setFont(new Font("Verdana", 2, 14));
        Label age = new Label("Age:");
        Label weight = new Label("Weight:");
        Label height = new Label("Height:");
        Label sex = new Label("Sex:");
        Label activity = new Label("Activity:");
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField weightField = new TextField();
        TextField heightField = new TextField();
        TextField sexField = new TextField();
        TextField activityField = new TextField();
        Scene scene2 = new Scene(pane2, 300, 200);

        pane2.add(name, 0, 0, 1, 1);
        pane2.add(age, 0, 1, 1, 1);
        pane2.add(weight, 0, 2, 1, 1);
        pane2.add(height, 0, 3, 1, 1);
        pane2.add(sex, 0, 4, 1, 1);
        pane2.add(activity, 0, 5, 1, 1);
        pane2.add(nameField, 1, 0, 1, 1);
        pane2.add(ageField, 1, 1, 1, 1);
        pane2.add(weightField, 1, 2, 1, 1);
        pane2.add(heightField, 1, 3, 1, 1);
        pane2.add(sexField, 1, 4, 1, 1);
        pane2.add(activityField, 1, 5, 1, 1);
        pane2.setHgap(5);
        pane2.setVgap(15);
        pane2.setAlignment(Pos.CENTER);
        button.setText("Next");




        primaryStage.setTitle("User Info");
        primaryStage.setScene(scene2);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        //Calling below method
        double r = GetREE(true,25,110,89);

        Label ree = new Label("If you eat more calories you will gain weight,If you eat less calories you will lose weight,If you eat this amount, you will maintain your weight.Your REE is "+ree);

//Display the label containing REE information
        pane2.add(ree,1,6,1,1);

    }

    public static double GetREE(Boolean isMale, int age, int height,int weight)
    {
        double ree = 0;
//Checks if gender is male
        if(isMale)
        {
            ree = 10 * weight + 6.25 * height - 5 * age + 5;
        }
// if gender is female
        else
        {
            ree = 10 * weight + 6.25 * height - 5 * age - 161;
        }

        return ree;
    }
    }