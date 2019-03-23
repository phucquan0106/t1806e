package DemoJavaFx.Controller;

import DemoJavaFx.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class CtrlList implements Initializable {

    public TableView<User> tblView;
    public TableColumn<User,Integer> colId;
    public TableColumn<User,String> colUsername;
    public TableColumn<User,String> colEmail;
    public TableColumn<User,Integer> colStatus;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colUsername.setCellValueFactory(new PropertyValueFactory<>("username"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

//        String sql = "SELECT * FROM user";
        ArrayList<User> listUser = new DAOUser().list();

        ObservableList<User> userList = FXCollections.observableArrayList(listUser);

//        try {
//            ResultSet rs = connector.statement.executeQuery(sql);
//            ObservableList<User> userList = FXCollections.observableArrayList();
//
//            while (rs.next()){
//                Integer user_id = rs.getInt("id");
//                String username = rs.getString("username");
//                String email = rs.getString("email");
//                Integer status = rs.getInt("status");
//
//                userList.add(new User(user_id,username,email,status));
//            }
//            tblView.setItems(userList);
//
//        }catch (SQLException e){}

        tblView.setItems(userList);
    }

    public void moveToRegister() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/register.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }

}
