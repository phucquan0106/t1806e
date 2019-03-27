package DemoJavaFx;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOUser implements DAOInterface<User> {

    Connector connector = Connector.getInstance();


    @Override
    public User getByUserPass(String username, String password) throws SQLException {
        String sql = "SELECT * FROM user where username LIKE '" + username + "' AND password LIKE '" + password + "'";
        ResultSet rs = connector.statement.executeQuery(sql);
        while (rs.next()) {
            Integer user_id = rs.getInt("id");
            String username1 = rs.getString("username");
            String email = rs.getString("email");
            Integer status = rs.getInt("status");


            return new User(user_id, username, email, status, null);
        }

        return null;
    }

    @Override
    public void save(User user) {
        String sql = "insert into user (username,email,password,status) VALUES ('" + user.username + "','" + user.email + "','" + user.password + "'," + user.status + ")";

        int rs = 0;
        try {
            rs = connector.statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (rs == 1) {
            System.out.println("Register Successful");
//            Parent root = FXMLLoader.load(getClass().getResource("../fxml/list.fxml"));
//            Main.mainStage.getScene().setRoot(root);
            return;
        }
    }

    @Override
    public ArrayList<User> list() {
        ArrayList<User> userList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM user";
            ResultSet rs = connector.statement.executeQuery(sql);
//            ObservableList<User> userList = FXCollections.observableArrayList();

            while (rs.next()) {
                Integer user_id = rs.getInt("id");
                String username = rs.getString("username");
                String email = rs.getString("email");
                Integer status = rs.getInt("status");


                userList.add(new User(user_id, username, email, status, null));
            }
//            tblView.setItems(userList);

        } catch (SQLException e) {
        }
        return userList;
    }

    @Override
    public int update(int id, User user) throws SQLException {
        String sql = "UPDATE user SET username = '" + user.username + "',password ='" + user.password + "' where id = " + id;
        System.out.println(sql);
        return connector.statement.executeUpdate(sql);
    }

    @Override
    public int delete(int id) throws SQLException {
        String sql = "DELETE FROM user WHERE id = "+ id;
        return connector.statement.executeUpdate(sql);
    }

    @Override
    public ArrayList<String> getPhoneById(int id) throws SQLException {
        String sql = "SELECT telephone FROM phonebook t INNER JOIN user u ON t.user_id = u.id WHERE t.id = "+id;
        ResultSet rs = connector.statement.executeQuery(sql);
        ArrayList<String> arrPhone = new ArrayList<>();
//
        while (rs.next()) {
            arrPhone.add(rs.getString("telephone"));
        }
        return  arrPhone;
    }


}
