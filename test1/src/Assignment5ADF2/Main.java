package Assignment5ADF2;

import java.sql.*;
import java.util.Scanner;

public class Main {

//    final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//    final static String JDBC_URL = "jdbc:mysql://localhost:8889/T1806E";
//    final static String JDBC_USER = "t1806e";
//    final static String JDBC_PASS = "t1806e123";

    public static void main(String args[]) {

        try {
//            Class.forName(Main.JDBC_DRIVER);
//            Connection conn = DriverManager.getConnection(Main.JDBC_URL,
//                    Main.JDBC_USER, Main.JDBC_PASS);
//            Statement statement = conn.createStatement();
//            Main.showMenu(statement);
//
//        } catch (ClassNotFoundException e) {
//
//        } catch (SQLException e) {
            Connector connector = new Connector();
            System.out.println("connected");
            Main.showMenu(connector);
            System.out.println("end");

        } catch (Exception e) {
        }
    }

    //    public static void showMenu(Statement statement) {
    public static void showMenu(Connector connector) {

        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        boolean flag = true;
        do {
            do {
                System.out.println("Lua chon chuc nang: ");
                System.out.println("1. Dang nhap");
                System.out.println("2. Dang ky");
                System.out.println("3. Danh sach nguoi dung");
                System.out.println("4. Xoa 1 nguoi dung");
                System.out.println("5. Thoat chuong trinh");
                menu = scanner.nextInt();
            } while (menu < 1 || menu > 5);

            switch (menu) {
//                    case 1:
//                        Main.login(statement);
//                        break;
//                    case 2:
//                        Main.register(statement);
//                        break;
                case 1:
                    Main.login(connector);
                    break;
                case 2:
                    Main.register(connector);
                    break;
                case 3:
                    Main.viewUser(connector);
                    break;
                case 4:
                    Main.deleteUser(connector);
                    break;
                case 5:
                    flag = false;
                    break;
            }
        } while (flag == true);


    }

    //        public static boolean login (Statement statement){
    public static boolean login(Connector connector) {
        boolean flag = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap username:");
        String username = scanner.nextLine();
        System.out.println("Nhap password:");
        String password = scanner.nextLine();
        String sql = "SELECT id FROM user WHERE username LIKE '"
                + username + "' AND password LIKE '" + password + "'";

        try {
//                    ResultSet rs = statement.executeQuery(sql);
            ResultSet rs = connector.getQuery(sql);
            if (rs.next()) {
                System.out.println("Dang nhap thanh cong.");
                return flag;
            }
            flag = false;
        } catch (SQLException e) {
        }
        System.out.println("Khong tim thay nguoi dung");
        return flag;
    }


    //            public static void register (Statement statement){
    public static void register(Connector connector) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap username:");
        String username = scanner.nextLine();
        System.out.println("Nhap email:");
        String email = scanner.nextLine();
        System.out.println("Nhap password:");
        String password = scanner.nextLine();

        String sql = "INSERT INTO user (username,email,password) VALUES('" + username
                + "','" + email + "','" + password + "')";
//                    try {
//                        statement.executeUpdate(sql);
        if (connector.getUpdate(sql)) {
            System.out.println("Dang ky thanh cong.");
            return;
//                        }catch(SQLException e){

        }
        System.out.println("Dang ky that bai");
    }
    public static void viewUser(Connector connector){
        System.out.println("Danh sach nguoi dung:");
        String sql = "SELECT * FROM user";
        try {
//                    ResultSet rs = statement.executeQuery(sql);
            ResultSet rs = connector.getQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt("id")+"--"+rs.getString("username")+"--"+rs.getString("email")+"--"+rs.getInt("status"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public static void deleteUser(Connector connector) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id user can xoa:");
        int id = scanner.nextInt();
        scanner.nextLine();

        String sql = "DELETE FROM user WHERE ID = "+Integer.toString(id);
//                    try {
//                        statement.executeUpdate(sql);
        if (connector.getUpdate(sql)) {
            System.out.println("Xoa User thanh cong.");
            return;
//                        }catch(SQLException e){

        }
        System.out.println("Xoa User that bai");
    }
}