package DemoJavaFx.Controller;

import DemoJavaFx.Connector;
import DemoJavaFx.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CtrlLogin {
    public TextField txtUsername;
    public PasswordField txtPassword;
    public void loginAction() throws SQLException, IOException {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        String sql = "SELECT id FROM user where username LIKE '"+username +"' AND password LIKE '"+password+"'";
        Connector connector = new Connector();
        ResultSet rs = connector.statement.executeQuery(sql);

        if(rs.next()){
            Parent root = FXMLLoader.load(getClass().getResource("../fxml/list.fxml"));
            Main.mainStage.getScene().setRoot(root);
            return;
        }
        System.out.println("Failed");

    }
    public void moveToRegister() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/register.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }
}
