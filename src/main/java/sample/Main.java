package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample.fxml"));
        primaryStage.setTitle("Agile Master 2000");
        primaryStage.setScene(new Scene(root, 1838, 975));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
