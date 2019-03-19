package DemoJavaFx;

import java.sql.*;

public class Connector {
    final static String JDBC_DRIVER  = "com.mysql.jdbc.Driver";
    final static String JDBC_URL = "jdbc:mysql://localhost:3306/t1806s2";
    final static String JDBC_USER  = "root";
    final static String JDBC_PASS  = "mysql168";

    public Connection conn;
    public Statement statement;

    public Connector(){
        try{
            Class.forName(Connector.JDBC_DRIVER);
            conn = DriverManager.getConnection(Connector.JDBC_URL,Connector.JDBC_USER,Connector.JDBC_PASS);
            statement = conn.createStatement();

        }catch (ClassNotFoundException e){

        }catch (SQLException e){

        }
    }

}
