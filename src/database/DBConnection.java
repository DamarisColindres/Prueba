package database;

import java.sql.*;

/**
 *
 * @author DELL
 */
public class DBConnection {

    public Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/gabyprueba?useSSL=false";
        String user = "root";
        String password = "my-12345";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión establecida con éxito");
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        return conn;
    }
}
