package DemoJavaFx.Controller;

import DemoJavaFx.Connector;
import DemoJavaFx.Main;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CtrlRegister {
    public TextField txtUsername;
    public PasswordField txtPassword;
    public TextField txtEmail;

    public void backToLogin() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/login.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }

    public void registerAction() throws SQLException, IOException {
        String username = txtUsername.getText();
        String email = txtEmail.getText();
        String password = txtPassword.getText();

        String sql = "insert into user (username,email,password,status) VALUES ('"+username+"','"+email+"','"+password+"',1)";
        Connector connector = new Connector();
        int rs = connector.statement.executeUpdate(sql);
        if(rs==1){
            System.out.println("Register Successful");
            Parent root = FXMLLoader.load(getClass().getResource("../fxml/list.fxml"));
            Main.mainStage.getScene().setRoot(root);
            return;
        }
        System.out.println("Register Unsuccesful");

    }
}
