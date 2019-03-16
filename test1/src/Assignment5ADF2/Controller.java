package Assignment5ADF2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TableColumn<User,Integer> id;
    public TableColumn<User,String> username;
    public TableColumn<User,String> email;
    public TableColumn<User,String> status;

    public TableView tableView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        id.setCellValueFactory(new PropertyValueFactory<User,Integer>("id"));
        username.setCellValueFactory(new PropertyValueFactory<User,String>("username"));
        email.setCellValueFactory(new PropertyValueFactory<User,String>("email"));
        status.setCellValueFactory(new PropertyValueFactory<User,String>("status"));

        Connector connector = new Connector();

        String sqlQuery = "SELECT * FROM user";

        try{
            ResultSet rs = connector.getQuery(sqlQuery);

            ObservableList<User> list = FXCollections.observableArrayList();

            while (rs.next()){
                Integer id = rs.getInt("id");
                String name = rs.getString("username");
                String email = rs.getString("email");
                Integer status = rs.getInt("status");
                User user = new User(id,name,email,status);
                list.add(user);
            }
            tableView.setItems(list);
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
