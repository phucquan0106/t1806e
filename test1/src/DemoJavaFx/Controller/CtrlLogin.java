package DemoJavaFx.Controller;

import DemoJavaFx.DAOUser;
import DemoJavaFx.Main;
import DemoJavaFx.User;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlLogin {
    public TextField txtUsername;
    public PasswordField txtPassword;
    public Label lblTop;
    public TextField txtId;


    public void loginAction() throws SQLException, IOException {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        User user = new DAOUser().getByUserPass(username, password);
        if (user != null) {
            Parent root = FXMLLoader.load(getClass().getResource("../fxml/list.fxml"));
            Main.mainStage.getScene().setRoot(root);
            return;
        }


//        String sql = "SELECT id FROM user where username LIKE '"+username +"' AND password LIKE '"+password+"'";
//        Connector connector = Connector.getInstance();
//        ResultSet rs = connector.statement.executeQuery(sql);
//
//        if(rs.next()){
//            Parent root = FXMLLoader.load(getClass().getResource("../fxml/list.fxml"));
//            Main.mainStage.getScene().setRoot(root);
//            return;
//        }
        System.out.println("Failed");

    }

    public void moveToRegister() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/register.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }

    public void updateAction() throws SQLException,IOException{
        int id = Integer.valueOf(txtId.getText().trim());
        User user = new User(null,txtUsername.getText(),null,null,txtPassword.getText());
        if(new DAOUser().update(id,user) == 1){
            Parent root = FXMLLoader.load(getClass().getResource("../fxml/list.fxml"));
            Main.mainStage.getScene().setRoot(root);
            return;
        }
        System.out.println("update unsuccessful");
    }

    public void deleteAction() throws SQLException, IOException {
        int id = Integer.valueOf(txtId.getText().trim());
        if(new DAOUser().delete(id) == 1){
            Parent root = FXMLLoader.load(getClass().getResource("../fxml/list.fxml"));
            Main.mainStage.getScene().setRoot(root);
            return;
        }
        System.out.println("delete unsuccessful");
    }
    public void getPhoneById() throws SQLException, IOException{
        int id = Integer.valueOf(txtId.getText().trim());
        ArrayList<String> arrPhone = new ArrayList<>();
        arrPhone = new DAOUser().getPhoneById(id);
        if(arrPhone.size() > 0){
            System.out.println("Phone number of user id "+id+ ":");
            for (String s: arrPhone) {
                System.out.println(s);
            }
            return;
        }
        System.out.println("not found");
    }
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//        lblTop.setText(Main.resourceBundle.getString("login_top"));
//    }
}
