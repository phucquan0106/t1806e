package Assignment2XML;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage mainStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Main.mainStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("fxml/weather.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Weather Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}