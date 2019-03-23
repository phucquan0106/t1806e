package DemoJavaFx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage mainStage;
    public static ResourceBundle resourceBundle;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Main.mainStage = primaryStage;

//        Main.resourceBundle = ResourceBundle.getBundle("DemoJavaFx.languages.message");


        Parent root = FXMLLoader.load(getClass().getResource("fxml/login.fxml"));
        Scene scene = new Scene(root,1015,525);
//        primaryStage.setTitle(Main.resourceBundle.getString("login_title"));
        primaryStage.setTitle("User Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
