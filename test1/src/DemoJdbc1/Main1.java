package DemoJdbc1;

import java.sql.*;

public class Main1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/t1806s2";
            String user = "root";
            String password = "mysql168";

            Connection connection = DriverManager.getConnection(url,user,password);
            String query = "SELECT * FROM student";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.print("id: "+ resultSet.getInt("id")+ " ;");
                System.out.print("name: "+ resultSet.getString("name")+ " ;");
                System.out.print("age: "+ resultSet.getInt("age")+ " ;");
                System.out.print("mark: "+ resultSet.getInt("mark")+ " ;");
                System.out.println();
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
