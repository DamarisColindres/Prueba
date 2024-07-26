
import database.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Persona;

public class Main {
    public static void main(String [] args) throws SQLException{
        System.out.println("Hola Mundo");
        DBConnection dbConnection = new DBConnection();
        
    Connection cn = dbConnection.getConnection(); //Genero mi conexion 
    Statement stmt = cn.createStatement(); //Indico que voy a ejecutar un query
    ResultSet rs = stmt.executeQuery("SELECT * FROM Persona"); //Obtengo el resultado del query
    
    
    List<Persona> listadoPersonas = new ArrayList<>();
    
    while(rs.next()){
        System.out.println("ID: " + rs.getInt("id"));
        System.out.println("primerNombre: " + rs.getString("primerNombre"));
        System.out.println("segundoNombre: " + rs.getString("segundoNombre"));
        System.out.println("primerApellido: " + rs.getString("primerApellido"));
        System.out.println("segundoApellido: " + rs.getString("segundoApellido"));
        System.out.println("edad:" + rs.getInt("edad"));
        System.out.println("genero:" + rs.getString("genero"));
    }
            
    
    /*while(rs.next(listadoPersonas.add(
            rs.getInt("id"),
            rs.getStrint("primerNombre"),
            rs.getStrint("segundoNombre"),
            rs.getStrint("primerApellido"),
            rs.getStrint("segundoApellido"),
            rs.getInt("edad"),
            rs.getString("genero"),
    )){        
    }*/
    
    }
}